package com.example.android.lab07_activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BackNextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_next);
    }

    public void back(View view) {
//        Intent intent = new Intent(this, NextActivity.class);
//        startActivity(intent);
        finish();
    }

    public void next(View view) {
        Intent intent = new Intent(this, BackMainActivity.class);
        startActivity(intent);
    }
}
