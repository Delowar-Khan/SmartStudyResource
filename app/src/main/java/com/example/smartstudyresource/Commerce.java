package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Commerce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);
    }
    public void undergradute_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Commerce_UnderGraduate.class));
    }

    public void nineten_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Commerce_NineTen.class));
    }

    public void eleventwelve_cource(View view) {
        startActivity(new Intent(getApplicationContext(), Commerce_ElevenTwelve.class));
    }
}
