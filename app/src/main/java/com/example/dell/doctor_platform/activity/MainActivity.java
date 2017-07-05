package com.example.dell.doctor_platform.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.example.dell.doctor_platform.R;
import com.example.dell.doctor_platform.fragment.Homefragment;
import com.example.dell.doctor_platform.fragment.LBSFragment;
import com.example.dell.doctor_platform.fragment.Searchfragment;
import com.example.dell.doctor_platform.fragment.SetFragment;

public class MainActivity extends SingleFragmentActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected Fragment createFragment() {
        return Homefragment.newInstance();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public int getContainerId() {
        return 0;
    }

    @Override
    public void init() {
        super.init();
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.navigation_home:
                switchFragment(Homefragment.newInstance());
                break;
            case R.id.navigation_find:
                switchFragment(Searchfragment.newInstance());
                break;
            case R.id.navigation_map:
                switchFragment(LBSFragment.newInstance());
                break;
            case R.id.navigation_set:
                switchFragment(SetFragment.newInstance());
        }
        return true;
    }
}
