package com.example.navigationdrawerapapplication


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class Contact : Fragment(), View.OnClickListener {
    private var mEditTextSubject: EditText? = null
    private var mEditTextMessage: EditText? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_contact, container, false)
        val btn2: Button = view.findViewById(R.id.button2)
        btn2.setOnClickListener(this)
        mEditTextSubject = view.findViewById(R.id.editTextTextPersonName)
        mEditTextMessage = view.findViewById(R.id.editTextTextPersonName2)
        return view

    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button2 -> {
                sendMail()
                Toast.makeText(activity, "Twoja wiadomość Została wysłana. Dziękujemy za kontakt.", Toast.LENGTH_LONG).show()
            }

            else -> {
            }
        }
    }

    private fun sendMail() {
        val email = arrayOf("testemail@gmail.com")
        val subject = mEditTextSubject!!.text.toString()
        val message = mEditTextMessage!!.text.toString()
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_EMAIL, email)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type = "message/rfc822"
        startActivity(Intent.createChooser(intent, "Wybierz aplikację do wysłania wiadomości"))
    }


}