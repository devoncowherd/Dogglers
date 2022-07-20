package com.example.googledogglers.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googledogglers.Dog
import com.example.googledogglers.R
import java.util.zip.Inflater

class DogAdapter(datasource : List<Dog>) : RecyclerView.Adapter<DogAdapter.DogCardViewHolder>(){

    var dogList = datasource

    class DogCardViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val dogPic : ImageView = view.findViewById(R.id.dogPic)
        val dogName : TextView = view.findViewById(R.id.dogName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogAdapter.DogCardViewHolder {
        return DogCardViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.dog_inflatable,parent,false)
        )
    }

    override fun onBindViewHolder(holder: DogAdapter.DogCardViewHolder, position: Int) {
        holder.dogName.text = dogList[position].NAME
        holder.dogPic.setImageResource(dogList[position].PHOTO)
    }

    override fun getItemCount(): Int {
        return dogList.size
    }
}