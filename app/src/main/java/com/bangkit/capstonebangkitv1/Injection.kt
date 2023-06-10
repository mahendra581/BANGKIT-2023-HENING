package com.bangkit.capstonebangkitv1

import android.content.Context
import com.bangkit.capstonebangkitv1.api.ApiConfig
import com.bangkit.capstonebangkitv1.datasource.DataSource

object Injection {
    fun provideRepository(context: Context): DataSource {
        val apiService = ApiConfig.getApiService()
        return DataSource.getInstance(apiService )
    }
}