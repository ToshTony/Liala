package com.example.tony.liala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pagequatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagequatro);


        Button buttst = (Button)findViewById(R.id.hbutt);

        buttst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intst = new Intent (pagequatro.this, Start.class);
                startActivity(intst);

            }
        });
    }
}
