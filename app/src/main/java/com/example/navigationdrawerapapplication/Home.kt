package com.example.navigationdrawerapapplication


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment



class Home : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        val btn: Button = view.findViewById(R.id.button)
        btn.setOnClickListener(this)
        return view
    }
    companion object {
        fun newInstance(): Home {
            return Home()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                Toast.makeText(activity, "PDF clicked", Toast.LENGTH_SHORT).show()
                var goToPDF: Intent = Intent(activity, Schedulepdf::class.java)
                startActivity(goToPDF)
            }

            else -> {
            }
        }
    }


}