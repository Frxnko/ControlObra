package com.example.controlobra.ui.projects

import androidx.lifecycle.ViewModel
import com.example.controlobra.data.ProjectProvider.Companion.projectsInfoList
import com.example.controlobra.domain.model.ProjectsInfo
import com.example.controlobra.domain.model.TitulosPartidasInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ProjectsViewModel @Inject constructor() : ViewModel() {
    //Estados.

    //private var _projects= MutableStateFlow<List<TitulosPartidasInfo>>(emptyList())
    private var _projects = MutableStateFlow<List<ProjectsInfo>>(emptyList())
    val projects: StateFlow<List<ProjectsInfo>> = _projects // no es mutable, llamando a este se pueden cargar los valores del mutable, pero no va a poder modificarlos

    init {
        _projects.value = projectsInfoList

    }  //luego que el frgament pueda engancharse al stakeholder
//metodo del view model es como el Oncreate
    // _projects.value=listOf(
    //   Cerco, Torre, Losas )

    fun getProjects() {
        listOf(
            Cerco, Torre, Losas
        )
    }

}