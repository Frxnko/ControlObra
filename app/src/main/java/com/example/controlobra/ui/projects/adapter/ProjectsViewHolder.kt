package com.example.controlobra.ui.projects.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.controlobra.R
import com.example.controlobra.databinding.ItemProjectsBinding
import com.example.controlobra.domain.model.ProjectsInfo

class ProjectsViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding=ItemProjectsBinding.bind(view)

//    fun render(projectsInfo: ProjectsInfo) {
//        val context=binding.tvtitle.context
//        binding.ivProjects.setImageResource(titulosPartidasInfo.img)
//        binding.tvtitle.text = context.getString(titulosPartidasInfo.name)
//    }


    val node=view.findViewById<TextView>(R.id.tvtitle)


fun render(projectsInfo: ProjectsInfo) {
        node.text= projectsInfo.site

    }
}