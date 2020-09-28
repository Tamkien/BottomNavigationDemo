package com.kienct.bottomnavigationdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.adapter.CoursesAdapter
import com.kienct.bottomnavigationdemo.adapter.MostViewedAdapter
import com.kienct.bottomnavigationdemo.model.Course
import com.kienct.bottomnavigationdemo.model.MostViewed

class HomeFragment : Fragment() {
    //to create new instance
    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }


    private lateinit var view1: RecyclerView
    private lateinit var view2: RecyclerView
    private val courses: MutableList<Course> = ArrayList()
    private val mostViews: MutableList<MostViewed> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.home, container, false)
        view1 = view.findViewById(R.id.courses_view)
        view2 = view.findViewById(R.id.most_viewed_view)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val courseAdapter = CoursesAdapter(courses)
        view1.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view1.adapter = courseAdapter
        val mostViewedAdapter = MostViewedAdapter(mostViews)
        view2.layoutManager = LinearLayoutManager(view?.context)
        view2.adapter = mostViewedAdapter
    }

    private fun addList() {
        courses.add(Course(R.drawable.image_0, "Software Development", "In software engineering, a software development process is the process of..."))
        courses.add(Course(R.drawable.image_2, "Data Professional", "Data scientist is one of the best suited professions to thrive this century."))
        mostViews.add(MostViewed(R.drawable.image_1, "Data The Data Science Course 2019: Complete Data Science Bootcamp"))
        mostViews.add(MostViewed(R.drawable.image_1, "bla bljsdhfklsfklsjfhsdjkfhalkfn"))
    }

}



