package com.example.dell.doctor_platform.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dell.doctor_platform.R;
import com.example.dell.doctor_platform.activity.LBSActivity;

/*
 * Created by Kentan on 2017/7/4.
 */

public class Homefragment extends Fragment implements View.OnClickListener {
    public static Fragment newInstance() {
        return new Homefragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Button turnMap = (Button) view.findViewById(R.id.turn_map);
        turnMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.turn_map:
                Intent intent = new Intent(getContext(), LBSActivity.class);
                startActivity(intent);
        }
    }
}
