package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Commerce_UnderGraduate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce__under_graduate);
    }

    public void year(View view) {
        startActivity(new Intent(getApplicationContext(), Commerce_UnderGraduate_Acc.class));
    }
}
