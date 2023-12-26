package com.appdeveloperrakib.thegreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        title = findViewById(R.id.title);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Welcome "+name+" to our app",
                        Toast.LENGTH_LONG).show();



            }
        });


    }
}