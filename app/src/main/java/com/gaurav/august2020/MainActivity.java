package com.gaurav.august2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.user_name);
        password = findViewById(R.id.password_field);
        login = findViewById(R.id.login_button);

    }

    public void loginClicked(View view) {

        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();

        if(usernameText.isEmpty() || passwordText.isEmpty()) {

            Toast.makeText(MainActivity.this, "Invalid inputs",Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(MainActivity.this, "Good job",Toast.LENGTH_LONG).show();

        }

    }

}