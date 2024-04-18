package com.example.controlobra.ui.informationNodes

import androidx.lifecycle.ViewModel
import com.example.controlobra.data.ProjectProvider.Companion.projectsInfoList
import com.example.controlobra.domain.model.ProjectsInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class InformationNodesViewModel @Inject constructor():ViewModel() {
    private var _nodes = MutableStateFlow<List<ProjectsInfo>>(emptyList())
    val nodes: StateFlow<List<ProjectsInfo>> = _nodes

    init{
        _nodes.value=projectsInfoList
    }

}