package com.example.bai2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends Activity {
    Button btnNext;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnNext = findViewById(R.id.button2);
        textView = findViewById(R.id.textViewShow);
        Intent intent = getIntent();
        String name = intent.getStringExtra("ten");
        String lop = intent.getStringExtra("lop");
        textView.setText("Name: "+ name + "\nLop: "+ lop);

        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}