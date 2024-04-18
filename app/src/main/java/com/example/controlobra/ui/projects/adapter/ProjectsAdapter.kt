package com.example.controlobra.ui.projects.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.controlobra.R
import com.example.controlobra.domain.model.ProjectsInfo

class ProjectsAdapter(private var projectList: List<ProjectsInfo> = emptyList()) :
    RecyclerView.Adapter<ProjectsViewHolder>() {

    fun updateList(list: List<ProjectsInfo>){
        projectList=list
        notifyDataSetChanged()//se cambiara todo el listado solo una vez
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {
        return ProjectsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_projects, parent, false) //lo que se va a pintar
        )
    }

    override fun getItemCount() = projectList.size

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        holder.render(projectList[position])
    }
}