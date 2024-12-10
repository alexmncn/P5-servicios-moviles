package com.alexmncn.p5_servicios_moviles;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle bundle = new Bundle();

        bundle.putString("message", "Integracion de Firebase Analytics");
        mFirebaseAnalytics.logEvent("InitScreen", bundle);
    }
}