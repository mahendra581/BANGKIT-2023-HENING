package com.bangkit.capstonebangkitv1.team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.capstonebangkitv1.R
import com.bangkit.capstonebangkitv1.article.ArticleData
import com.bangkit.capstonebangkitv1.databinding.ActivityTeamBinding

class TeamActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTeamBinding
    private lateinit var rvTeam: RecyclerView
    private val list = ArrayList<TeamData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTeam.layoutManager = GridLayoutManager(this, 2)
        rvTeam = binding.rvTeam
        rvTeam.setHasFixedSize(true)
//        list.addAll(getListHeroes())
//        showRecyclerList()
    }

//    private fun getListHeroes(): ArrayList<TeamData> {
//        val dataName = resources.getString(R.string.data_name)
//        val dataPhoto = resources.getString(R.string.data_photo)
//        val listHero = ArrayList<TeamData>()
//
//        val team = TeamData(name =dataName, photoUrl = dataPhoto)
//        listHero.add(team)
//        return listHero
//    }
//
//    private fun showRecyclerList() {
//        rvTeam.layoutManager = GridLayoutManager(this, 2)
//        val listHeroAdapter = TeamAdapter(list)
//        rvTeam.adapter = listHeroAdapter
//    }
}