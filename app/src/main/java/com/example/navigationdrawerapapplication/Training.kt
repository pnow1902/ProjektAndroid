package com.example.navigationdrawerapapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Training : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_training, container, false)
        val btn3: Button = view.findViewById(R.id.button3)
        btn3.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button3 -> {
                val goToMap = Intent(activity, Map::class.java)
                startActivity(goToMap)

            }

            else -> {
            }
        }
    }
}