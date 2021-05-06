package com.example.navigationdrawerapapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class Schedulepdf : AppCompatActivity() {

    private lateinit var mPDFView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pdf_view)

        mPDFView = findViewById(R.id.pdfView)
        mPDFView.fromAsset("terminarz.pdf").load()

    }

}