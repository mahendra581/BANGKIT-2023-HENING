package com.bangkit.capstonebangkitv1.article

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bangkit.capstonebangkitv1.datasource.DataSource
import com.bangkit.capstonebangkitv1.response.ArticleResponse
import kotlinx.coroutines.launch


class ModelArticle(private val dataSource: DataSource) : ViewModel() {
    val listArticles: LiveData<ArticleResponse> = dataSource.listActivities

    //    fun getArticles() = dataSource.dataArticle()
    fun getArticles(id: String, title: String,photoUrl: String,text:String,source: String) {
        viewModelScope.launch {
            dataSource.dataArticle(id,title, photoUrl, text, source)
            Log.d("listActivity", "$listArticles")
        }
    }
}