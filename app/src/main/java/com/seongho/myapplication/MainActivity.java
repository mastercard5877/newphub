package com.seongho.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void PhubClicked(View v){
        Intent Phub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pornhub.com"));
        startActivity(Phub);
    }
    public void XvidClicked(View v){
        Intent Xvid = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xvideo.es"));
        startActivity(Xvid);
    }
}
