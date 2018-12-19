package com.example.tony.liala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageuno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageuno);

        Button butt3 = (Button)findViewById(R.id.nextuno);

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(pageuno.this, pageddos.class);

                startActivity(int3);

            }
        });
    }
}
