package com.example.sabanahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class diacita extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button5;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diacita);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.centros, R.layout.lays);
        adapter4.setDropDownViewResource(R.layout.drops);
        spinner.setAdapter(adapter4);
        spinner.setOnItemSelectedListener(this);

        Spinner spinner1 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.vacunas, R.layout.lays );
        adapter5.setDropDownViewResource(R.layout.drops);
        spinner1.setAdapter(adapter5);
        spinner1.setOnItemSelectedListener(this);

        Spinner spinner2 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this, R.array.hora, R.layout.lays );
        adapter7.setDropDownViewResource(R.layout.drops);
        spinner2.setAdapter(adapter7);
        spinner2.setOnItemSelectedListener(this);


        setContentView(R.layout.activity_diacita);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openlista();
            }
        });

        /*setContentView(R.layout.activity_diacita);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openregister();
            }
        });
      */

    }
    private void openlista(){
        Intent intent = new Intent(this, lista.class);
        startActivity(intent);

    }
    /*private void openregister(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);

    }
  */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}