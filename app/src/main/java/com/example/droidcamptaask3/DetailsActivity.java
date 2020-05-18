package com.example.droidcamptaask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    String fName;
    TextView newName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        newName = findViewById(R.id.newName);

        Intent intent = getIntent();
        fName = intent.getStringExtra("fName");
        newName.setText("My Name is: " + fName);
    }
}
