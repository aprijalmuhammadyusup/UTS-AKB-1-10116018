package com.example.afrizalmy.uts_akb_1_10116018;
//20Mei-10116018-Aprijal Muhammad Yusup-AKB1
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SlideActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private slideadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new slideadapter(this);
        viewPager.setAdapter(myadapter);
    }
}
