package com.example.sabanahack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset( "FAQ.pdf").load();
    }
}