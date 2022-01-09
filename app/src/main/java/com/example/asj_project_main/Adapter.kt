package com.example.asj_project_main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding

class Adapter(private val health: List<healthcare>,
              private val clickListener: healthclicklistener
              ): RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding= ViewBinding.inflate(from,parent,false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindHealth(health[position])
    }

    override fun getItemCount(): Int = health.size
}