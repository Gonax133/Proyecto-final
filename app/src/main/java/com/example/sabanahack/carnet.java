package com.example.sabanahack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class carnet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnet);

        PDFView pdfView = findViewById(R.id.pdfview1);
        pdfView.fromAsset( "CARNET DE VACUNACION.pdf").load();
    }
}