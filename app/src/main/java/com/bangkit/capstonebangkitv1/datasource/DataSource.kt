package com.bangkit.capstonebangkitv1.datasource

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bangkit.capstonebangkitv1.api.ApiService
import com.bangkit.capstonebangkitv1.response.ArticleResponse
import retrofit2.Call
import com.bangkit.capstonebangkitv1.Result
import com.bangkit.capstonebangkitv1.api.ApiConfig
import retrofit2.Callback
import retrofit2.Response

class DataSource private constructor(
//    private val preference: LoginPreferences,
    private val apiService: ApiService
) {
    private val _article = MutableLiveData<ArticleResponse>()
    val listActivities: LiveData<ArticleResponse> = _article

    fun dataArticle(id: String, title: String,photoUrl: String,text:String,source: String) {
        val client = ApiConfig.getApiService().dataArticle(id,title, photoUrl, text, source)
        client.enqueue(object : Callback<ArticleResponse> {
            override fun onResponse(
                call: Call<ArticleResponse>,
                response: Response<ArticleResponse>
            ) {
                if (response.isSuccessful) {
                    Log.e("listActivityResponse", "onResponse: ${response.message()}")
                    _article.value = response.body()
                } else {
                    Log.e("listActivity", "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
                Log.e("storyFailure", "onFailure: ${t.message}")
            }
        })
    }

//    fun dataArticle(
//    ): LiveData<Result<ArticleResponse>> {
//        _article.value = Result.Loading
//        val client = apiService.dataArticle()
//        client.enqueue(object : Callback<ArticleResponse> {
//            override fun onResponse(
//                call: Call<ArticleResponse>,
//                response: Response<ArticleResponse>
//            ) {
//                if (response.isSuccessful) {
//                    val responseBody = response.body()
//                    if (responseBody != null) {
//                        _article.value = Result.Success(responseBody)
//                    }
//                } else {
//                    _article.value = Result.Error(REGISTER_ERROR)
//                    Log.e("registerResponse", "onResponse: ${response.message()}")
//                }
//            }
//
//            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
//                Log.e("registerFailure", "onFailure: ${t.message}")
//
//            }
//        })
//        return _article
//    }

    companion object {
        private const val REGISTER_ERROR = "Failed get article"

        @Volatile
        private var INSTANCE: DataSource? = null

        fun getInstance(apiService: ApiService): DataSource =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: DataSource(apiService)
            }.also { INSTANCE = it }
    }
}