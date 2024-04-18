package com.example.controlobra.ui.projects

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.controlobra.databinding.FragmentInformationNodesBinding
import com.example.controlobra.databinding.FragmentProjectsBinding
import com.example.controlobra.ui.projects.adapter.ProjectsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProjectsFragment : Fragment() {

    private val projectsViewModel by viewModels<ProjectsViewModel>() //Delegado. Enganchar al viewModel. Se conceta el fragment al viewModel
    private lateinit var projectsadapter:ProjectsAdapter

    private var _binding: FragmentProjectsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()//iniciamos recilerview
        initUIState()
    }

    private fun initList() {
        projectsadapter= ProjectsAdapter()

        binding.rvProjects.apply {
            layoutManager = LinearLayoutManager(context)
            adapter=projectsadapter
        }
    }

    private fun initUIState() {
        //Nos enganchamos al viewmodel
        //se usaran corrutinas. Para acciones en primer plano, segundo plano.
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                projectsViewModel.projects.collect {
                    //Log.i("Chunga", it.toString())
                    // Cambios generados
                    projectsadapter.updateList(it)
                }//collect es como engancharse, suscribete
            }
        }// se engancha al ciclo de vida del fragment
    }

    /**
    override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View {
    _binding = FragmentProjectsBinding.inflate(layoutInflater, container, false)
    return binding.root
    }
     **/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProjectsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}