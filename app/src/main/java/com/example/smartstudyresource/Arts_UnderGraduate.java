package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arts_UnderGraduate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts__under_graduate);
    }

    public void year(View view) {
        startActivity(new Intent(getApplicationContext(), Arts_UnderGraduate_Eco.class));

    }
}
