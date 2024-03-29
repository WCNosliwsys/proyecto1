package com.ingwilson.myapplication;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MiFragmentTabhost extends FragmentActivity {
    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_fragment_tabhost);
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,
                getSupportFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Lengüeta 1"),
                Tab1.class, null);
     tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Lengüeta 2"),
    Tab2.class, null);
    tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),
    Tab3.class, null);
    }
}
