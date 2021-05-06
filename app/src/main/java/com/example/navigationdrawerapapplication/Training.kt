package com.example.navigationdrawerapapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Training : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_training, container, false)
        val btn: Button = view.findViewById(R.id.button3)
        btn.setOnClickListener(this)
        return view
    }
    companion object {
        fun newInstance(): Training {
            return Training()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button3 -> {
                Toast.makeText(activity, "Map clicked", Toast.LENGTH_SHORT).show()
                var goToMap: Intent = Intent(activity, Map::class.java)
                startActivity(goToMap)

            }

            else -> {
            }
        }
    }
}