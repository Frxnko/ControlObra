package com.example.controlobra.ui.informationNodes.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.controlobra.databinding.ItemNodeBinding
import com.example.controlobra.domain.model.ProjectsInfo

class InformationNodesHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding= ItemNodeBinding.bind(view)

    fun render(projectsInfo: ProjectsInfo){
        val context=binding.tvtitle.context

        binding.tvtitle.text="okok"+projectsInfo.nodeType
        binding.titleType.text=projectsInfo.site
        //binding.tvtitle.text=context.getString(projectsInfo.site)

    }
}