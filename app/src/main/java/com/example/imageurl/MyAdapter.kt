package com.example.imageurl

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(val context: Context,private val data: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>()  {

        class MyViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
          var title = itemView.findViewById<TextView>(R.id.tvTitle)
            var description = itemView.findViewById<TextView>(R.id.tvDescription)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = data[position].toString()
        holder.description.text=data[position].toString()


    }

    override fun getItemCount(): Int {
       return data.size
    }
}



