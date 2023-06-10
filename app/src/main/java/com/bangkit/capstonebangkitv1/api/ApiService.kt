package com.bangkit.capstonebangkitv1.api

import com.bangkit.capstonebangkitv1.response.ArticleResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("articles")
    fun dataArticle(
        @Query("id") id: Int,
        @Query("title") title: String,
        @Query("imageURL") photoUrl: Int,
        @Query("text") text:String,
        @Query("sourceURL")  source: String
    ): Call<ArticleResponse>
}
