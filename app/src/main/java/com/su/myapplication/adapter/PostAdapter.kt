package com.su.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.su.myapplication.R
import com.su.myapplication.databinding.ItemPostBinding
import com.su.myapplication.model.Post

class PostAdapter(
    private val posts: List<Post>,
    private val onPostClick: (Post) -> Unit
): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    private var _binding: ItemPostBinding? = null
    private val binding get() = _binding!!

    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(post: Post) {
            binding.postTitle.text = post.title
            itemView.setOnClickListener {
                onPostClick(post)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        _binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding.root)
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        _binding = null
    }
}