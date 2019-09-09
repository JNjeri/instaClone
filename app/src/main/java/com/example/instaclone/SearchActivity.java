package com.example.instaclone;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    private static final String Tag ="SearchActivity";

//to start an activity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Activity_Home);
        Log.d(TAG, "onCreate: Started");

setupBottomNavigationView();


    }
}
