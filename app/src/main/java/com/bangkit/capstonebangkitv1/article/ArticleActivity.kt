package com.bangkit.capstonebangkitv1.article

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.capstonebangkitv1.ModelFactory
import com.bangkit.capstonebangkitv1.R
import com.bangkit.capstonebangkitv1.databinding.ActivityArticleBinding
import com.bangkit.capstonebangkitv1.databinding.ActivityHomepageBinding
import com.bangkit.capstonebangkitv1.response.DataItem
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class ArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticleBinding
    private lateinit var dbRef: DatabaseReference
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var rvStory: RecyclerView
    private var userArrayList = mutableListOf<ArticleData>()
    private lateinit var factory: ModelFactory
    private val model: ModelArticle by viewModels { factory }
    private lateinit var listActivity: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        factory = ModelFactory.getInstance(this)
        supportActionBar?.apply {
            title = getString(R.string.article)
        }

        rvStory = binding.rvArticle
        rvStory.layoutManager = LinearLayoutManager(this)
        rvStory.setHasFixedSize(true)

//        userArrayList = arrayListOf<ArticleData>()
//        getUserData()
        settingAdapter()
        getArticle()
    }

    //    private fun getUserData() {
//        firebaseDatabase = FirebaseDatabase.getInstance()
//        dbRef = firebaseDatabase.getReference("data")
//
//        dbRef.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//
//
//                for(list in snapshot.children){
//                    val id = list.key
//                    val title = list.child("title").value.toString()
//                    val text = list.child("text").value.toString()
//                    val photoUrl = list.child("photoUrl").value.toString()
//
//                    val artikel = ArticleData(id = id, title=title, text = text, photoUrl = photoUrl)
//                    userArrayList.add(artikel)
//                }
//                Log.e("successsss", "size: ${userArrayList.size}")
//                rvStory.adapter = ArticleAdapter(userArrayList)
//
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Log.w(TAG, "Failed to read value.", error.toException())
//            }
//
//
//        })
//    }
    private fun settingAdapter() {
        model.listArticles.observe(this) { adapter ->
            if (adapter != null) {
                binding.rvArticle.adapter = ArticleAdapter(adapter.data)
            }
        }
    }

    private fun getArticle() {
        val id = intent.getStringExtra(ID)
        val title = intent.getStringExtra(TITLE)
        val photoUrl = intent.getStringExtra(IMAGEURL)
        val text = intent.getStringExtra(TEXT)
        val source = intent.getStringExtra(SOURCE)

        model.listArticles.observe(this) {
            listActivity = it.data as ArrayList<DataItem>
            Log.d("story", listActivity.toString())
        }
        model.getArticles(id.toString(), title.toString(), photoUrl.toString(), text.toString(), source.toString())
    }

    companion object {
        const val ID = "id"
        const val TITLE = "title"
        const val IMAGEURL = "imageURL"
        const val TEXT = "text"
        const val SOURCE = "sourceURL"
    }
}