package com.example.navigationdrawerapapplication

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView


class MainActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var fragmentTransaction: FragmentTransaction


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        this.setTitle(R.string.app_name1)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

        val fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container_fragment, Home())
        fragmentTransaction.commit()


    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {

                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Home())
                fragmentTransaction.commit()
            }
            R.id.nav_team -> {
                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Team())
                fragmentTransaction.commit()
            }
            R.id.nav_reserves -> {
                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Reserves())
                fragmentTransaction.commit()
            }
            R.id.nav_staff -> {
                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Staff())
                fragmentTransaction.commit()
            }
            R.id.nav_training -> {
                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Training())
                fragmentTransaction.commit()
            }
            R.id.nav_contact -> {
                val fragmentManager = supportFragmentManager
                fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container_fragment, Contact())
                fragmentTransaction.commit()
            }

        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}
