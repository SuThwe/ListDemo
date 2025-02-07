package com.su.myapplication.data

import com.su.myapplication.model.Post

class PostRepository {

    private val apiService = RetrofitClient.apiService

    suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}