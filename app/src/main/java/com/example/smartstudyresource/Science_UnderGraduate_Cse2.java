package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Science_UnderGraduate_Cse2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_under_graduate_cse2);
    }

    public void oop_link(View view) {
        String url="https://www.scribd.com/document/434217776/dlscrib-com-c-programming-by-balagurusamy-6th-edition-pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void ds_link(View view) {
        String url="https://www.scribd.com/document/434217776/dlscrib-com-c-programming-by-balagurusamy-6th-edition-pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void ad_link(View view) {
        String url="https://www.scribd.com/document/434217776/dlscrib-com-c-programming-by-balagurusamy-6th-edition-pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void se_link(View view) {
        String url="https://www.scribd.com/document/434217776/dlscrib-com-c-programming-by-balagurusamy-6th-edition-pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void db_link(View view) {
        String url="https://www.shahucollegelatur.org.in/Department/Studymaterial/sci/it/BCA/FY/digielec.pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}