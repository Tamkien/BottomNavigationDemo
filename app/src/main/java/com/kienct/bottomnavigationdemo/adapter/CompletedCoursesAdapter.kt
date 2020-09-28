package com.kienct.bottomnavigationdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R

class CompletedCoursesAdapter (private val imgSrc : MutableList<Int>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.completed_courses_layout, parent, false)
        return ViewHolder(v)
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img : ImageView = v.findViewById(R.id.imageView6)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val coursesAdapter = imgSrc[position]
        (holder as ViewHolder).img.setImageResource(coursesAdapter)
        }

    override fun getItemCount(): Int {
        return imgSrc.size
    }
}