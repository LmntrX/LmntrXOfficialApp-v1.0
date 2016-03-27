package com.lmntrx.lmntrxofficialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Finance extends Base_Activity_Navigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (useToolbar()) {
            setSupportActionBar(toolbar);
            setTitle("Finance");
        } else {
            toolbar.setVisibility(View.GONE);
        }
    }
}
