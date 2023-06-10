package com.bangkit.capstonebangkitv1.response

import com.google.gson.annotations.SerializedName

data class ArticleResponse(

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("status")
	val status: String
)

data class DataItem(

	@field:SerializedName("sourceURL")
	val sourceURL: String,

	@field:SerializedName("imageURL")
	val imageURL: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("text")
	val text: String,

	@field:SerializedName("title")
	val title: String
)
