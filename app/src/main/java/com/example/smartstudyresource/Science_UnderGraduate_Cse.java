package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Science_UnderGraduate_Cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_under_graduate_cse);
    }

    public void cse_first(View view) {
        startActivity(new Intent(getApplicationContext(), Science_UnderGraduate_Cse1.class));

    }

    public void cse_second(View view) {
        startActivity(new Intent(getApplicationContext(), Science_UnderGraduate_Cse2.class));

    }

    public void cse_third(View view) {
        startActivity(new Intent(getApplicationContext(), Science_UnderGraduate_Cse3.class));

    }

    public void cse_fourth(View view) {
        startActivity(new Intent(getApplicationContext(), Science_UnderGraduate_Cse4.class));
    }
}