package com.example.productdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.one.Manager;
import com.example.one.Tools;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMain = findViewById(R.id.tvMain);
        tvMain.setText(BuildConfig.BASE_API_URL + "...." + Tools.sayHello());
        Manager.manager();
//        Log.i("lxm","base_url = "+BuildConfig.BASE_API_URL);
    }
}
