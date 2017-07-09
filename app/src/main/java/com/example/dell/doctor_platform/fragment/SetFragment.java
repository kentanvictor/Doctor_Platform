package com.example.dell.doctor_platform.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.dell.doctor_platform.R;
import com.example.dell.doctor_platform.gson.Person;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

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
        add = (Button) view.findViewById(R.id.add_person);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1.setName("kentan");
                p1.setAddress("America");
                p1.save(new SaveListener<String>() {
                    @Override
                    public void done(String objectId, BmobException e) {
                        if (e == null) {
                            Log.d(LOG_TAG,"Succeeded");
                            Toast.makeText(getContext(), "添加数据成功，返回objectId为：" + objectId, Toast.LENGTH_SHORT).show();
                        } else {
                            Log.d(LOG_TAG,"Fail");
                            Toast.makeText(getContext(), "创建数据失败：" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
