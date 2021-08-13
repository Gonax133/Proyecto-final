package com.example.sabanahack;


import android.Manifest;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

public class confirmacion extends AppCompatActivity {

private Button botons, generatePDFbtn;
 //----------------------------------------------------------DATE PICKER 1
    String date1;
    public static final String DATE_DIALOG_1 = "datePicker1";
    static TextView txt_date1;
    private static int mYear1;
    private static int mMonth1;
    private static int mDay1;
    //----------------------------------------------------------DATE PICKER 1


    //----------------------------------------------------------DATE PICKER 2
    String date2;
    public static final String DATE_DIALOG_2 = "datePicker2";
    static TextView txt_date2;
    private static int mYear2;
    private static int mMonth2;
    private static int mDay2;
    //----------------------------------------------------------DATE PICKER 2
     Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        generatePDFbtn = findViewById(R.id.idBtnGeneratePDF);
        generatePDFbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                opencarnet();


            }
        });



        botons = (Button) findViewById(R.id.buttonEXIT);
        botons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                System.exit(0);

            }
        });
//----------------------------------------------------------DATE PICKER 1
        txt_date1 = findViewById(R.id.txt_date1);
        txt_date1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DialogFragment newFragment1 = new DatePickerFragment1();
                newFragment1.show(getSupportFragmentManager(), DATE_DIALOG_1);
            }
        });
        //----------------------------------------------------------DATE PICKER 1


        //----------------------------------------------------------DATE PICKER 2
        txt_date2 = findViewById(R.id.txt_date2);
        txt_date2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DialogFragment newFragment2 = new DatePickerFragment2();
                newFragment2.show(getSupportFragmentManager(), DATE_DIALOG_2);
            }
        });


        //----------------------------------------------------------DATE PICKER 2
    }

    //----------------------------------------------------------DATE PICKER 1
    public static class DatePickerFragment1 extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // set default date

            //Date Time FROM BEFORE
//            String date =  txt_date1.getText().toString().trim();
//            String[] data = date.split("-", 3);
//            int year = Integer.parseInt(data[0]);
//            int month = Integer.parseInt(data[1])-1;    //Because January is 0
//            int day = Integer.parseInt(data[2]);

            //Date Time NOW
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(),R.style.DatePicker1, this, year, month, day);
        }
        public void onDateSet(DatePicker view, int year, int month, int day) {
            // get selected date
            mYear1 = year;
            mMonth1 = month;
            mDay1 = day;
            // show selected date to date button
            txt_date1.setText(new StringBuilder()
                    .append(mYear1).append("-")
                    .append(mMonth1 + 1).append("-")
                    .append(mDay1).append(" "));
        }
    }
    //----------------------------------------------------------DATE PICKER 1


    //----------------------------------------------------------DATE PICKER 2
    public static class DatePickerFragment2 extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // set default date

            //Date Time FROM BEFORE
            String date = txt_date2.getText().toString().trim();
            String[] data = date.split("-", 3);
            int year = Integer.parseInt(data[0]);
            int month = Integer.parseInt(data[1]) - 1;    //Because January is 0
            int day = Integer.parseInt(data[2]);

            //Date Time NOW
            //final Calendar c = Calendar.getInstance();
            //int year = c.get(Calendar.YEAR);
            //int month = c.get(Calendar.MONTH);
            //int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), R.style.DatePicker2, this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // get selected date
            mYear2 = year;
            mMonth2 = month;
            mDay2 = day;
            // show selected date to date button
            txt_date2.setText(new StringBuilder()
                    .append(mYear2).append("-")
                    .append(mMonth2 + 1).append("-")
                    .append(mDay2).append(" "));
        }



        //----------------------------------------------------------DATE PICKER 2
    }

    private void opencarnet(){
        Intent intent = new Intent(this, carnet.class);
        startActivity(intent);

    }


}

