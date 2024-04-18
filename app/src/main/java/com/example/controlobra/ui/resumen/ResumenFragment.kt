package com.example.controlobra.ui.resumen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.controlobra.R
import com.example.controlobra.databinding.FragmentMoreMenuBinding
import com.example.controlobra.databinding.FragmentResumenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResumenFragment : Fragment() {

    private var _binding: FragmentResumenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResumenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}