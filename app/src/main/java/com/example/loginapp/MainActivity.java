package com.example.loginapp;

import static com.example.loginapp.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;


import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

EditText username_input, password_input;
Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        username_input = findViewById(R.id.username_input);
        password_input = findViewById(R.id.password_input);
        loginBtn = findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get username and password from EditText
                String username = username_input.getText().toString();
                String password = password_input.getText().toString();

                // Check if username and password are empty
                if (username.isEmpty() || password.isEmpty()) {
                    // Show a toast message if username or password is empty
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform your login operation here, for simplicity, let's just show a toast with the entered credentials
                    String message = "Username: " + username + "\nPassword: " + password;
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, DashBoard.class);
                    startActivity(intent);
                    finish();
                }
            }


        });
    }
}