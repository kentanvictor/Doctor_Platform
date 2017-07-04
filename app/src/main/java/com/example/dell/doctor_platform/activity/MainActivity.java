package com.example.dell.doctor_platform.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell.doctor_platform.R;

public class MainActivity extends BaseActivity {
    private Button lbsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbsActivity = (Button) findViewById(R.id.LBS_Activity);
        lbsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LBSActivity.class);
                startActivity(intent);
            }
        });
    }
}
