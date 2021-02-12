package com.example.profiles_assignemnt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Group I");
    }

    public void OnClick1(View view) {
        Intent intent = new Intent(this, igor_activity.class);
        startActivity(intent);
    }

    public void OnClick3(View view) {
        Intent intent3 = new Intent(this, Amir_Mokhammad.class);
        startActivity(intent3);
    }
}