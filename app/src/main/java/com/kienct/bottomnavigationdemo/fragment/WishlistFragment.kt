package com.kienct.bottomnavigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.adapter.TopCoursesAdapter
import com.kienct.bottomnavigationdemo.model.TopCourse

class WishlistFragment : Fragment() {
    companion object {
        fun newInstance(): WishlistFragment {
            return WishlistFragment()
        }
    }

    private lateinit var recyclerView: RecyclerView
    private val topCourses: MutableList<TopCourse> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.wishlist, container, false)
        recyclerView = view.findViewById(R.id.wishlist_view)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val topCoursesAdapter = TopCoursesAdapter(topCourses)
        recyclerView.layoutManager = LinearLayoutManager(view?.context)
        recyclerView.adapter = topCoursesAdapter

    }

    private fun addList() {
        topCourses.add(TopCourse("Learn Python like a Professional! Start from the basics and go all the way to creating your...", R.drawable.course0, 4.6.toFloat()))
        topCourses.add(TopCourse("Learn How To Plan, Design, Create And Publish Your Games On Any Platform Using Unity Game....", R.drawable.course1, 4.4.toFloat()))
        topCourses.add(TopCourse("Use React Native and your React knowledge and take your web development skills to build...", R.drawable.course2, 4.2.toFloat()))
    }
}
