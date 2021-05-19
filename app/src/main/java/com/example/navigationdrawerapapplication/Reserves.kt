package com.example.navigationdrawerapapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.navigationdrawerapapplication.reserves.*

class Reserves : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
            val view: View = inflater.inflate(R.layout.fragment_reserves, container, false)
            val gk: ImageButton = view.findViewById(R.id.reserves_gk)
            gk.setOnClickListener(this)
            val lb: ImageButton = view.findViewById(R.id.reserves_lb)
            lb.setOnClickListener(this)
            val rb: ImageButton = view.findViewById(R.id.reserves_rb)
            rb.setOnClickListener(this)
            val cb1: ImageButton = view.findViewById(R.id.reserves_cb1)
            cb1.setOnClickListener(this)
            val cb2: ImageButton = view.findViewById(R.id.reserves_cb2)
            cb2.setOnClickListener(this)
            val cdm: ImageButton = view.findViewById(R.id.reserves_cdm)
            cdm.setOnClickListener(this)
            val cm: ImageButton = view.findViewById(R.id.reserves_cm)
            cm.setOnClickListener(this)
            val cam: ImageButton = view.findViewById(R.id.reserves_cam)
            cam.setOnClickListener(this)
            val lw: ImageButton = view.findViewById(R.id.reserves_lw)
            lw.setOnClickListener(this)
            val rw: ImageButton = view.findViewById(R.id.reserves_rw)
            rw.setOnClickListener(this)
            val st: ImageButton = view.findViewById(R.id.reserves_st)
            st.setOnClickListener(this)
            val res1: ImageButton = view.findViewById(R.id.reserves_res1)
            res1.setOnClickListener(this)
            val res2: ImageButton = view.findViewById(R.id.reserves_res2)
            res2.setOnClickListener(this)
            val res3: ImageButton = view.findViewById(R.id.reserves_res3)
            res3.setOnClickListener(this)
            val res4: ImageButton = view.findViewById(R.id.reserves_res4)
            res4.setOnClickListener(this)
            val res5: ImageButton = view.findViewById(R.id.reserves_res5)
            res5.setOnClickListener(this)
            return view
        }


        override fun onClick(v: View?) {
            when (v?.id) {
                R.id.reserves_gk -> {
                    val goTo = Intent(activity, Gk::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_lb -> {
                    val goTo = Intent(activity, Lb::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_rb -> {
                    val goTo = Intent(activity, Rb::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_cb1 -> {
                    val goTo = Intent(activity, Cb1::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_cb2 -> {
                    val goTo = Intent(activity, Cb2::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_cdm -> {
                    val goTo = Intent(activity, Cdm::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_cm -> {
                    val goTo = Intent(activity, Cm::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_cam -> {
                    val goTo = Intent(activity, Cam::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_lw -> {
                    val goTo = Intent(activity, Lw::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_rw -> {
                    val goTo = Intent(activity, Rw::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_st -> {
                    val goTo = Intent(activity, St::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_res1 -> {
                    val goTo = Intent(activity, Res1::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_res2 -> {
                    val goTo = Intent(activity, Res2::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_res3 -> {
                    val goTo = Intent(activity, Res3::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_res4 -> {
                    val goTo = Intent(activity, Res4::class.java)
                    startActivity(goTo)

                }
                R.id.reserves_res5 -> {
                    val goTo = Intent(activity, Res5::class.java)
                    startActivity(goTo)

                }
                else -> {
                }
            }
        }

}