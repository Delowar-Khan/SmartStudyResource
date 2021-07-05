package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arts_UnderGraduate_Eco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts_under_graduate_eco);
    }

    public void eco_first(View view) {
        startActivity(new Intent(getApplicationContext(), Arts_UnderGraduate_Eco1.class));

    }
}