package com.example.higherorlowerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCheck;
    private EditText edtNumber;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheck = findViewById(R.id.btnCheck);
        edtNumber = findViewById(R.id.edtNumber);

        randomNumber = (int) (Math.random() * 10 + 1);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = edtNumber.getText().toString();
                int valueInInt = Integer.parseInt(value);

                if (valueInInt < randomNumber) {
                    Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();
                } else if (valueInInt > randomNumber) {
                    Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You guessed it right", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
