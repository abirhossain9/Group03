package com.abirhossain.nsu.fall2020.cse299.sec03.group03.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signUpNowButton, loginNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpNowButton = (Button)findViewById(R.id.get_started_Signup);
        loginNowButton = (Button)findViewById(R.id.get_started_login);

        
    }
}