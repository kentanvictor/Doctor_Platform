package com.example.dell.doctor_platform;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by DELL on 2017/7/9.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,"fc49e0d873ae4a3d3abf55f7062ed079");
    }
}
