package com.kienct.bottomnavigationdemo.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kienct.bottomnavigationdemo.R
import com.kienct.bottomnavigationdemo.fragment.ProfileFragment
import com.kienct.bottomnavigationdemo.fragment.WishlistFragment
import com.kienct.bottomnavigationdemo.fragment.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("onCreate", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val defaultFragment = HomeFragment.newInstance()
        openFragment(defaultFragment)
        //call bottom nav view by id
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavView)
        //create on-click listener
        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                //"if" by id
                R.id.home -> {
                    //create new instance
                    val songsFragment = HomeFragment.newInstance()
                    openFragment(songsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profile -> {
                    val albumFragment = ProfileFragment.newInstance()
                    openFragment(albumFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.artist -> {
                    val artistFragment = WishlistFragment.newInstance()
                    openFragment(artistFragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            true
        }
        //set the listener
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    //open fragments
    private fun openFragment(fragment: Fragment) {
        Log.d("Fragment", "Trying to add")
        val transaction = supportFragmentManager.beginTransaction()
        //replace this fragment into the old one. There are more e.g add, remove etc
        transaction.replace(R.id.fragment_container, fragment, "New Fragment")
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
