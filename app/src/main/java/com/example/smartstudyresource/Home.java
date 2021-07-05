package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void science(View view) {
        startActivity(new Intent(getApplicationContext(),Science.class));
    }

    public void Arts(View view) {
        startActivity(new Intent(getApplicationContext(),Arts.class));
    }

    public void commerce(View view) {
        startActivity(new Intent(getApplicationContext(),Commerce.class));
    }
}
