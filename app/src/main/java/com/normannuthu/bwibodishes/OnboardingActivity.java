package com.normannuthu.bwibodishes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class OnboardingActivity extends AppCompatActivity {

    ImageView logo, appName, splashImg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);

        splashImg.animate().translationY(-1600).setDuration(2000).setStartDelay(5000);
        logo.animate().translationY(1400).setDuration(2000).setStartDelay(5000);
        appName.animate().translationY(1400).setDuration(2000).setStartDelay(5000);
        lottieAnimationView.animate().translationY(1400).setDuration(2000).setStartDelay(5000);
    }
}