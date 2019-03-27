package com.lottchina.xdbao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getResources().getDrawable(R.drawable.ico)

        Log.e("aa","----" + BuildConfig.HTTP_API + "*******" + BuildConfig.isDebug);
    }
}
