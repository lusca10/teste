package com.example.layoutnene;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bit = (Button) findViewById(R.id.bit);
        bit.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Tel.class);
                startActivity(it);
            }

        });

        }
    }

