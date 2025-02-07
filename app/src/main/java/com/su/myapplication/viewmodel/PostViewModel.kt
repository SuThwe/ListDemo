package com.su.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.su.myapplication.data.PostRepository
import com.su.myapplication.model.Post
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {

    private val repo = PostRepository()

    private var _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> get() = _posts

    fun getPosts() {
        viewModelScope.launch {
            try {
                _posts.value = repo.getPosts()

            }catch (e: Exception) {
                //Handle errors
            }
        }
    }
}