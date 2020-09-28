package com.kienct.bottomnavigationdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.model.MostViewed

class MostViewedAdapter(private val mDataSet: MutableList<MostViewed>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.most_viewed_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val mostViewedAdapter = mDataSet[position]
        (holder as ViewHolder).img.setImageResource(mostViewedAdapter.imgSrc)
        holder.label.text = mostViewedAdapter.label
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: ImageView = itemView.findViewById(R.id.imageView4)
        var label: TextView = itemView.findViewById(R.id.textView10)
    }
}