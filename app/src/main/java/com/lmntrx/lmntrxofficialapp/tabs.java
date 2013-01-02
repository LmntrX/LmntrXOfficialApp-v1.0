package com.lmntrx.lmntrxofficialapp;

import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class tabs extends Base_Activity_Navigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            setTitle("Tabs");

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("One", FragmentTemplate.newFragment("1").getClass())
                .add("Two", FragmentTemplate.newFragment("2").getClass())
                .add("Three", FragmentTemplate.newFragment("3").getClass())
                .add("Four", FragmentTemplate.newFragment("4").getClass())
                .add("Five", FragmentTemplate.newFragment("5").getClass())
                .add("Six", FragmentTemplate.newFragment("6").getClass())
                .create());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        assert viewPager != null;
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        assert viewPagerTab != null;
        viewPagerTab.setViewPager(viewPager);
    }
}
