package com.example.kaixoandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botoie;
    private TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoie = findViewById(R.id.botoie);
        helloText = findViewById(R.id.helloText);

        //Botoie klikatzeko
        botoie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botoie.setVisibility(View.INVISIBLE); // Ixkutau botoie
                helloText.setVisibility(View.VISIBLE); // Hello Android erakutsi
            }
        });
    }
}


