package com.bangkit.capstonebangkitv1.response

import com.google.gson.annotations.SerializedName

data class ArticleResponse(

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("status")
	val status: String
)

data class DataItem(

	@field:SerializedName("Content")
	val content: String,

	@field:SerializedName("Title")
	val title: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("Image")
	val image: String,

	@field:SerializedName("Source")
	val source: String,

	@field:SerializedName("Provide")
	val provide: String
)
