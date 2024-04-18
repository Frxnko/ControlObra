package com.example.controlobra.ui.moreMenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.controlobra.databinding.FragmentMoreMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoreMenuFragment : Fragment() {

    private var _binding: FragmentMoreMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMoreMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}