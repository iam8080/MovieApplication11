package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout   tabLayout;
    private ViewPager   viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tabLayout   =   findViewById(R.id.tab);
        viewPager   =   findViewById(R.id.viewpage);
        tabLayout.setupWithViewPager(viewPager);
        Adpater adpater =   new Adpater(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adpater.addFragment(new Serie_Fragment(),"Series");
        adpater.addFragment(new Film_fragment(),"Film");
        adpater.addFragment(new MyList_Fragment(),"My List");
        viewPager.setAdapter(adpater);


    }
}