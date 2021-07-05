package com.example.smartstudyresource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Science_ElevenTwelve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_eleven_twelve);
    }

    public void nctbeleventwelve_link(View view) {
        String url="http://nctb.gov.bd/site/page/ac3e2b79-5045-4b87-9a5e-f5b59a53e0ee";
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}