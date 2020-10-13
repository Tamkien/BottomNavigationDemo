package com.kienct.bottomnavigationdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.model.TopCourse

class TopCoursesAdapter(private val topCourses: MutableList<TopCourse>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.top_course_layout, parent, false)
        return ViewHolder(v)
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.imageView7)
        var r: RatingBar = v.findViewById(R.id.ratingBar)
        var desc: TextView = v.findViewById(R.id.textView16)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val course = topCourses[position]
        (holder as ViewHolder).img.setImageResource(course.imgSrc)
        holder.desc.text = course.description
        holder.r.rating = course.rating

    }

    override fun getItemCount(): Int {
        return topCourses.size
    }

}
