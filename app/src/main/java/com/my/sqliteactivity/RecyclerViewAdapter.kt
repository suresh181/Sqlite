package com.my.sqliteactivity

import android.app.Activity
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context: Activity, private val id: Array<String>, private val name: Array<String>, private val email: Array<String>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val textId:TextView =itemView.findViewById(R.id.textViewId)
        val textName:TextView = itemView.findViewById(R.id.textViewName)
        val textEmail:TextView= itemView.findViewById(R.id.textViewEmail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.custom_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textId.text = id[position]
        holder.textName.text=name[position]
        holder.textEmail.text=email[position]
    }

    override fun getItemCount(): Int {
        return id.size
    }
}