package com.kienct.bottomnavigationdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.model.Course

class CoursesAdapter(private val mDataSet: MutableList<Course>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.course_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val coursesAdapter = mDataSet[position]
        (holder as ViewHolder).img.setImageResource(coursesAdapter.imgSrc)
        holder.label.text = coursesAdapter.label
        holder.desc.text = coursesAdapter.description
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: ImageView = itemView.findViewById(R.id.imageView3)
        var label: TextView = itemView.findViewById(R.id.textView7)
        var desc: TextView = itemView.findViewById(R.id.textView9)
    }
}