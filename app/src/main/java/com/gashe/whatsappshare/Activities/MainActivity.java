package com.gashe.whatsappshare.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gashe.whatsappshare.R;
import com.gashe.whatsappshare.Utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils utils = new Utils();
        utils.createViewPagerAndTabs(this, getSupportFragmentManager());

    }
}
