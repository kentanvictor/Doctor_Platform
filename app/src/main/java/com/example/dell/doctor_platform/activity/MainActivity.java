package com.example.dell.doctor_platform.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

import com.example.dell.doctor_platform.R;
import com.example.dell.doctor_platform.fragment.Homefragment;
import com.example.dell.doctor_platform.fragment.LBSFragment;
import com.example.dell.doctor_platform.fragment.Searchfragment;
import com.example.dell.doctor_platform.fragment.SetFragment;

import java.util.ArrayList;

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
        return R.id.fragment_container;
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
        switch (item.getItemId()) {
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

    public static class HomepagerAdapter extends PagerAdapter {
        private ArrayList<FrameLayout> viewList;

        public HomepagerAdapter(ArrayList<FrameLayout> viewList) {
            this.viewList = viewList;
        }

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            position %= viewList.size();
            if (position < 0) {
                position = viewList.size() + position;
            }
            FrameLayout view = viewList.get(position);
            //如果View已经在之前添加到了一个父组件，则必须先remove，否则会抛出IllegalStateException。
            ViewParent vp = view.getParent();
            if (vp != null) {
                ViewGroup parent = (ViewGroup) vp;
                parent.removeView(view);
            }
            container.addView(view);
            //add listeners here if necessary
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
        }
    }

    @Override
    public void onBackPressed() {

    }
}
