package com.example.controlobra.ui.informationNodes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.controlobra.databinding.FragmentInformationNodesBinding
import com.example.controlobra.ui.informationNodes.adapter.InformationNodesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class InformationNodesFragment : Fragment() {

    private val informationNodesViewModel by viewModels<InformationNodesViewModel>() //Delegado. Enganchar al viewModel. Se conceta el fragment al viewModel
    private lateinit var informationNodesAdapter: InformationNodesAdapter

    private var _binding: FragmentInformationNodesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initiUIState()
    }

    private fun initList() {
        informationNodesAdapter= InformationNodesAdapter()

        binding.rvNodes.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=informationNodesAdapter
        }
    }

    private fun initiUIState() {
//Se hacen uso de corrutinas
    //Nos enganchamos al Node del informationNodesViewModel
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                informationNodesViewModel.nodes.collect(){
                    //Cambio en nodos
                    informationNodesAdapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInformationNodesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}