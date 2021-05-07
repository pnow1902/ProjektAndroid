package com.example.navigationdrawerapapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.navigationdrawerapapplication.team.*
import kotlin.collections.Map

class Team : Fragment(), View.OnClickListener  {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_team, container, false)
        val gk: ImageButton = view.findViewById(R.id.team_gk)
        gk.setOnClickListener(this)
        val lb: ImageButton = view.findViewById(R.id.team_lb)
        lb.setOnClickListener(this)
        val rb: ImageButton = view.findViewById(R.id.team_rb)
        rb.setOnClickListener(this)
        val cb1: ImageButton = view.findViewById(R.id.team_cb1)
        cb1.setOnClickListener(this)
        val cb2: ImageButton = view.findViewById(R.id.team_cb2)
        cb2.setOnClickListener(this)
        val cdm: ImageButton = view.findViewById(R.id.team_cdm)
        cdm.setOnClickListener(this)
        val cm: ImageButton = view.findViewById(R.id.team_cm)
        cm.setOnClickListener(this)
        val cam: ImageButton = view.findViewById(R.id.team_cam)
        cam.setOnClickListener(this)
        val lw: ImageButton = view.findViewById(R.id.team_lw)
        lw.setOnClickListener(this)
        val rw: ImageButton = view.findViewById(R.id.team_rw)
        rw.setOnClickListener(this)
        val st: ImageButton = view.findViewById(R.id.team_st)
        st.setOnClickListener(this)
        val res1: ImageButton = view.findViewById(R.id.team_res1)
        res1.setOnClickListener(this)
        val res2: ImageButton = view.findViewById(R.id.team_res2)
        res2.setOnClickListener(this)
        val res3: ImageButton = view.findViewById(R.id.team_res3)
        res3.setOnClickListener(this)
        val res4: ImageButton = view.findViewById(R.id.team_res4)
        res4.setOnClickListener(this)
        val res5: ImageButton = view.findViewById(R.id.team_res5)
        res5.setOnClickListener(this)
        return view
    }
    companion object {
        fun newInstance(): Training {
            return Training()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.team_gk -> {
                Toast.makeText(activity, "Gk Clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Gk::class.java)
                startActivity(goTo)

            }
            R.id.team_lb -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Lb::class.java)
                startActivity(goTo)

            }
            R.id.team_rb -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Rb::class.java)
                startActivity(goTo)

            }
            R.id.team_cb1 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Cb1::class.java)
                startActivity(goTo)

            }
            R.id.team_cb2 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Cb2::class.java)
                startActivity(goTo)

            }
            R.id.team_cdm -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Cdm::class.java)
                startActivity(goTo)

            }
            R.id.team_cm -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Cm::class.java)
                startActivity(goTo)

            }
            R.id.team_cam -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Cam::class.java)
                startActivity(goTo)

            }
            R.id.team_lw -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Lw::class.java)
                startActivity(goTo)

            }
            R.id.team_rw -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Rw::class.java)
                startActivity(goTo)

            }
            R.id.team_st -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, St::class.java)
                startActivity(goTo)

            }
            R.id.team_res1 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Res1::class.java)
                startActivity(goTo)

            }
            R.id.team_res2 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Res2::class.java)
                startActivity(goTo)

            }
            R.id.team_res3 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Res3::class.java)
                startActivity(goTo)

            }
            R.id.team_res4 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Res4::class.java)
                startActivity(goTo)

            }
            R.id.team_res5 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goTo: Intent = Intent(activity, Res5::class.java)
                startActivity(goTo)

            }
            else -> {
            }
        }
    }

}