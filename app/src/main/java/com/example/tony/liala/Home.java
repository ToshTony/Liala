package com.example.tony.liala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button butt1 = (Button)findViewById(R.id.signin);
        Button butt2 = (Button)findViewById(R.id.createaccount);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Home.this, login.class);
                startActivity(int1);
            }
            });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(Home.this, pageuno.class);
                startActivity(int2);

            }
        });

    }
}
