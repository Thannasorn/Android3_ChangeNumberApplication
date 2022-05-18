package com.thannasorn.changenumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText decText;
    private Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decText = (EditText) findViewById(R.id.decText);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dec;
                dec = Integer.parseInt(decText.getText().toString());
                String binText = "";
                binText = decToBin( dec);
                Toast.makeText(MainActivity.this,binText, Toast.LENGTH_LONG).show();
            }
        });
    }

    private String decToBin(int dec){
        int temp = dec;
        String binary = "";
        while (temp > 0)
        {
            if (temp >= 2)
            {
                binary = (temp % 2) + binary;
            }
            else
            {
                binary = temp + binary;
            }
            temp = temp / 2;
        }
        return ("Binary Number : "+binary);
    }
}