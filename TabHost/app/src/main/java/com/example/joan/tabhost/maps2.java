package com.example.joan.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class maps2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.google.com/maps/d/edit?mid=1t1TskOn_HYC-2pq3qOTE5j3PKtg&ll=20.116758609617413%2C-98.74386000000004&z=14");


    }
}
