package com.example.afrizalmy.uts_akb_1_10116018;
//20Mei-10116018-Aprijal Muhammad Yusup-AKB1
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {
    private static int Splash_Time_Out = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreenActivity.this, SlideActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, Splash_Time_Out);
    }
}