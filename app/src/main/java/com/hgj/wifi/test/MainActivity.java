package com.hgj.wifi.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AnimIconButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (AnimIconButton) findViewById(R.id.anim_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.animController(true);
                button.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button.animController(false);
                    }
                },5000);
            }
        });
    }
}
