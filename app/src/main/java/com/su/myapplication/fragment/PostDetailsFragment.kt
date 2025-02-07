package com.su.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.su.myapplication.R
import com.su.myapplication.databinding.FragmentPostDetailsBinding
import com.su.myapplication.model.Post

class PostDetailsFragment : Fragment() {

    private var _binding: FragmentPostDetailsBinding? = null
    private val binding: FragmentPostDetailsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPostDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val post: Post? = arguments?.getParcelable(ARG_POST)
        post?.let {
            binding.postDetailsTitle.text = post.title
        }
    }

    companion object {
        private const val ARG_POST = "post"

        @JvmStatic
        fun newInstance(post: Post) =
            PostDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_POST, post)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}