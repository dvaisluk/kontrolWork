package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity{

    Spinner s_day, s_month, s_year,s_pol;
    EditText editText_puls, editText_puls2;
    Button button_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> days = new ArrayList<String>();
        for (int i = 1; i <= 31; i++) {
            days.add(Integer.toString(i));
        }

        ArrayList<String> years = new ArrayList<String>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 1900; i <= thisYear; i++) {
            years.add(Integer.toString(i));
        }
 
        String[] Months = new String[] { "January", "February",
                "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        String[] Pol = new String[] { "Male", "Female" };

         s_day = (Spinner) findViewById(R.id.spinner_day);
         s_month = (Spinner) findViewById(R.id.spinner_month);
         s_year = (Spinner) findViewById(R.id.spinner_year);
         s_pol = (Spinner) findViewById(R.id.spinner_pol);

         editText_puls = (EditText) findViewById(R.id.editText_puls);
         editText_puls2 = (EditText) findViewById(R.id.editText_puls2);

        button_next = (Button) findViewById(R.id.button_next);
        button_next.setOnClickListener(this::OnClick);


        s_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        s_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        s_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        s_pol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }

    public void OnClick(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putStringArray("values", new String[]{editText_puls.getText().toString(), editText_puls2.getText().toString()});
        intent.putExtras(b);
        startActivity(intent);}

}