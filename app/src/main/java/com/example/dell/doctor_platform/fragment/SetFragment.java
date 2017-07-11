package com.example.dell.doctor_platform.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dell.doctor_platform.R;
import com.example.dell.doctor_platform.gson.Person;

/*
 * Created by Kentan on 2017/7/4.
 */

public class SetFragment extends Fragment {
    private static final String LOG_TAG =  "MY_LOG_TAG";
    private Button add;
    Person p1 = new Person();

    public static Fragment newInstance() {
        return new SetFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_set, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
