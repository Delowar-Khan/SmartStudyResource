package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Commerce_UnderGraduate_Acc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce_under_graduate_acc1);
    }

    public void ac_link(View view) {
        String url="https://www.scribd.com/document/434217776/dlscrib-com-c-programming-by-balagurusamy-6th-edition-pdf";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}