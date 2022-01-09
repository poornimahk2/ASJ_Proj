package com.example.asj_project_main

import androidx.recyclerview.widget.RecyclerView
import com.example.asj_project_main.databinding.ViewBinding

class CardViewHolder(
    private val viewBinding: ViewBinding,
    private val clickListener: healthclicklistener
):RecyclerView.ViewHolder(viewBinding.root) {
    fun bindHealth(healthcare: healthcare){
        viewBinding.cover.setImageResource(healthcare.cover)
        viewBinding.titleView.text = healthcare.title

        viewBinding.cardView.setOnClickListener{
            clickListener.onClick(healthcare)
        }
    }
}