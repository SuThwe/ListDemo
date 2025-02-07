package com.su.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.su.myapplication.R
import com.su.myapplication.adapter.PostAdapter
import com.su.myapplication.databinding.FragmentPostListBinding
import com.su.myapplication.model.Post
import com.su.myapplication.viewmodel.PostViewModel

class PostListFragment : Fragment() {

    private var _binding: FragmentPostListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: PostViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPostListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.posts.observe(viewLifecycleOwner) { posts ->
            val adapter = PostAdapter(posts) { selectedPost ->
                openDetailsPost(selectedPost)
            }
            binding.recyclerView.adapter = adapter
        }
        viewModel.getPosts()
    }

    private fun openDetailsPost(post: Post) {
        val detailsFragment = PostDetailsFragment.newInstance(post)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, detailsFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}