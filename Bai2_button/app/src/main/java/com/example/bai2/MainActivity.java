package com.example.bai2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBack = findViewById(R.id.button);
        btnBack.setOnClickListener(new View.OnClickListener() {

            /*
            * ===================================================
            *                       Intent
            * ===================================================
            * - ACTION_VIEW |
            * - ACTION_DIAL |  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            * - ACTION_EDIT |
            * - ACTION_PICK
            * */
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
                startActivityForResult(intent, 1234);
            }
        });

    }
}