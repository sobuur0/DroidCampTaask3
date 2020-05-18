package com.example.droidcamptaask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed_name,newName;
    Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_name = findViewById(R.id.ed_name);
        aboutButton = findViewById(R.id.aboutButton);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myName = ed_name.getText().toString();
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("fName", ed_name.getText().toString());
                startActivity(intent);

            }
        });

    }
}
