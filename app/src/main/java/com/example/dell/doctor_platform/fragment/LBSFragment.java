package com.example.dell.doctor_platform.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.doctor_platform.R;

/*
 * Created by Kentan on 2017/7/4.
 */

public class LBSFragment extends Fragment {
    public static Fragment newInstance()
    {
        return new LBSFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lbs,container,false);
        return v;
    }
}
