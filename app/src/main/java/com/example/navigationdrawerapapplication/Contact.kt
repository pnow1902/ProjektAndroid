package com.example.navigationdrawerapapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Contact : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_contact, container, false)
        val btn2: Button = view.findViewById(R.id.button2)
        btn2.setOnClickListener(this)
        return view
    }
    companion object {
        fun newInstance(): Contact {
            return Contact()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button2 -> {
                Toast.makeText(activity, "Twoja wiadomość Została wysłana. Dziękujemy za kontakt.", Toast.LENGTH_LONG).show()
            }

            else -> {
            }
        }
    }




}