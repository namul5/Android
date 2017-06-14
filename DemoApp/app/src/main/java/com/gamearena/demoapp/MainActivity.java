package com.gamearena.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;

private FirebaseAnalytics mFirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Obtain the FirebaseAnalytics instance.
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
