package com.kienct.bottomnavigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.adapter.CompletedCoursesAdapter
import com.kienct.bottomnavigationdemo.adapter.TopCoursesAdapter
import com.kienct.bottomnavigationdemo.model.TopCourse


class ProfileFragment : Fragment() {
    companion object {
        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    private lateinit var view1: RecyclerView
    private lateinit var view2: RecyclerView
    private val completedCoursesImgSrc: MutableList<Int> = ArrayList()
    private val topCourses: MutableList<TopCourse> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.profile, container, false)
        view1 = view.findViewById(R.id.completed_course_view)
        view2 = view.findViewById(R.id.top_courses_view)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val completedCoursesAdapter = CompletedCoursesAdapter(completedCoursesImgSrc)
        view1.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view1.adapter = completedCoursesAdapter
        val topCoursesAdapter = TopCoursesAdapter(topCourses)
        view2.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view2.adapter = topCoursesAdapter

    }

    private fun addList() {
        completedCoursesImgSrc.add(R.drawable.course1)
        completedCoursesImgSrc.add(R.drawable.course2)
        completedCoursesImgSrc.add(R.drawable.course3)
        completedCoursesImgSrc.add(R.drawable.course4)
        topCourses.add(TopCourse("Learn Python like a Professional! Start from the basics and go all the way to creating your...", R.drawable.course0, 4.6.toFloat()))
        topCourses.add(TopCourse("Learn How To Plan, Design, Create And Publish Your Games On Any Platform Using Unity Game....", R.drawable.course1, 4.4.toFloat()))
        topCourses.add(TopCourse("Use React Native and your React knowledge and take your web development skills to build...", R.drawable.course2, 4.2.toFloat()))
    }
}

