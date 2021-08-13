package com.example.sabanahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lista extends AppCompatActivity {
    private Button buttons;
    private int mCounter;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        buttons = (Button) findViewById(R.id.button6);
        txv =(TextView) findViewById(R. id. tx);
        buttons.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openconfirmacion();
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }
    private void openconfirmacion(){
        Intent intent = new Intent(this, confirmacion.class);
        startActivity(intent);

    }

}