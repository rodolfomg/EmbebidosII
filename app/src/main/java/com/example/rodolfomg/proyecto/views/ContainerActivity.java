package com.example.rodolfomg.proyecto.views;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.rodolfomg.proyecto.R;
import com.example.rodolfomg.proyecto.views.fragments.CalendarFragment;
import com.example.rodolfomg.proyecto.views.fragments.HomeFragment;
import com.example.rodolfomg.proyecto.views.fragments.ProfileFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

/**
 * Created by rodolfo on 8/11/17.
 */

public class ContainerActivity extends AppCompatActivity {
    HomeFragment home;
    CalendarFragment calendar;
    ProfileFragment profile;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar menu = (BottomBar) findViewById(R.id.bottom_bar);
        menu.setDefaultTab(R.id.home);

        menu.setOnTabSelectListener(new OnTabSelectListener(){
            @Override
            public void onTabSelected(@IdRes int tabId){

                switch (tabId){
                    case R.id.home:
                        home = new HomeFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container, home)
                                .setTransition(
                                   FragmentTransaction.TRANSIT_FRAGMENT_FADE
                                )
                                .addToBackStack(null)
                                .commit();
                }

            }
        });
    }
}
