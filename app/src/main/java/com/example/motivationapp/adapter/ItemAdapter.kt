package com.example.motivationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motivationapp.R
import com.example.motivationapp.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
            val textView:TextView = view.findViewById(R.id.txt_item)
            val imageView:ImageView = view.findViewById(R.id.img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemAffirmation = dataset[position]
        holder.textView.text = context.resources.getString(itemAffirmation.idResource)
        holder.imageView.setImageResource(itemAffirmation.imageResource)
    }

    override fun getItemCount() = dataset.size
}