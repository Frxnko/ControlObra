package com.example.controlobra.ui.informationNodes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.controlobra.R
import com.example.controlobra.domain.model.ProjectsInfo

class InformationNodesAdapter(private var projectnodesList: List<ProjectsInfo> = emptyList()) :
    RecyclerView.Adapter<InformationNodesHolder>(){ //ProjectsViewHolder

    fun updateList(list: List<ProjectsInfo>){
        projectnodesList=list
        notifyDataSetChanged()//se cambiara todo el listado solo una vez
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformationNodesHolder {
        return InformationNodesHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_node, parent, false)
        )
    }

    override fun getItemCount()= projectnodesList.size

    override fun onBindViewHolder(holder: InformationNodesHolder, position: Int) {
        holder.render(projectnodesList[position])
    }


}