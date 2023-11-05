package com.example.ggplaystore

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class AppAdapter(val items: ArrayList<AppModel>) :
    RecyclerView.Adapter<AppAdapter.RVItemViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AppAdapter.RVItemViewHolder {
        val itemView = LayoutInflater.from(p0.context)
            .inflate(R.layout.app_item, p0, false)
        return RVItemViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: RVItemViewHolder, p0: Int) {
        viewHolder.name.text = items[p0].name
        viewHolder.rate.text = items[p0].rate
        viewHolder.img.setImageResource( items[p0].img)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class RVItemViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val rate: TextView
        val img: ImageView

        init {
            name = itemView.findViewById(R.id.app_name)
            rate = itemView.findViewById(R.id.app_rate)
            img = itemView.findViewById(R.id.app_img)
        }
    }


}