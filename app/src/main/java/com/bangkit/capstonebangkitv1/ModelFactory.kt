package com.bangkit.capstonebangkitv1

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bangkit.capstonebangkitv1.article.ModelArticle
import com.bangkit.capstonebangkitv1.datasource.DataSource

class ModelFactory(private val pref: DataSource) : ViewModelProvider.NewInstanceFactory()  {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ModelArticle::class.java) -> {
                ModelArticle(pref) as T
            }
            else -> throw IllegalArgumentException("Unknown Model class: " + modelClass.name)
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: ModelFactory? = null

        fun getInstance(context: Context): ModelFactory =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: ModelFactory(Injection.provideRepository(context))
            }.also { INSTANCE = it }
    }
}