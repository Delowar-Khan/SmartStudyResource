package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Science_UnderGraduate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science__under_graduate);
    }


    public void year(View view) {
        startActivity(new Intent(getApplicationContext(), Science_UnderGraduate_Cse.class));
    }
}

