package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Commerce_UnderGraduate_Acc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce_under_graduate_acc);
    }

    public void acc_first(View view) {
        startActivity(new Intent(getApplicationContext(), Commerce_UnderGraduate_Acc1.class));

    }
}