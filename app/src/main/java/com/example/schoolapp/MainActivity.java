package com.example.schoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        edt1 = findViewById(R.id.user);
        edt2 = findViewById(R.id.pas);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkValidation()) {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                }

            }
        });
    }

    public boolean checkValidation() {
        String name = edt1.getText().toString().trim();
        String pas = edt2.getText().toString().trim();

        if (name.length() <= 0) {
            edt1.requestFocus();
            edt1.setError("Enter Name");
            return false;
        } else if (pas.length() <= 0) {
            edt2.requestFocus();
            edt2.setError("Enter Password");
            return false;
        } else {
            return true;
        }
    }
}
