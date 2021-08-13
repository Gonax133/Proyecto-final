package com.example.sabanahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.Document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class register extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String dirrecion, EPS, date,identificar, phone, carnet,name;
    EditText Tarjeta, telef,nacimiento,dirrec,Eps, identidad,nombre;
     private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nombre = (EditText) findViewById(R.id.nombre);
        Tarjeta = (EditText) findViewById(R.id.Tarjeta);
        telef = (EditText) findViewById(R.id.telef);
        nacimiento = (EditText) findViewById(R.id.nacimiento);
        Eps = (EditText) findViewById(R.id.Eps);
        identidad = (EditText) findViewById(R.id.identidad);
        dirrec = (EditText) findViewById(R.id.dirrec);

        Spinner spinner3 = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.identificacion, R.layout.select);
        adapter3.setDropDownViewResource(R.layout.drop);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);



        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name = nombre.getText().toString();
                dirrecion = dirrec.getText().toString();
                EPS= Eps.getText().toString();
                date= nacimiento.getText().toString();
                identificar = Tarjeta.getText().toString();
                phone= telef.getText().toString();
                carnet= identidad.getText().toString();


                opendiacita();
            }
        });
    }
    private void opendiacita(){
        Intent intent = new Intent(this, diacita.class);

        startActivity(intent);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}


