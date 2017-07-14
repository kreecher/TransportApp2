package com.example.joan.tabhost;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TabHost;

/**
 * Created by Joan on 14/07/2017.
 */

public class maps extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://www.google.com/maps/d/edit?mid=1XEPPVYTFkJDt6e94tpS3KMsH8_8&ll=20.036997776831676%2C-98.7182297&z=11");


    }
}
