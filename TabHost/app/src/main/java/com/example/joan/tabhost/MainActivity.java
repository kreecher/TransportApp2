package com.example.joan.tabhost;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TabHost tab = (TabHost) findViewById(R.id.tabhost);
        tab.setup();
        TabHost.TabSpec spec1 = tab.newTabSpec("Tab 1");
        spec1.setIndicator("RUTAS");
        spec1.setContent(R.id.layout1);
        tab.addTab(spec1);

        TabHost.TabSpec spec2 = tab.newTabSpec("Tab 2");
        spec2.setIndicator("RECOMENDACIONES");
        spec2.setContent(R.id.layout2);
        tab.addTab(spec2);

    }

    public void cambiar(View view){
        Intent intent = new Intent(this, maps.class);
        startActivity(intent);

    }

    public void centro(View view){
        Intent intent = new Intent(this, maps2.class);
        startActivity(intent);

    }

}



