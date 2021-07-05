package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
    }

    public void undergradute_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Arts_UnderGraduate.class));
    }
    public void nineten_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Arts_NineTen.class));
    }
    public void eleventwelve_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Arts_ElevenTwelve.class));
    }
}
