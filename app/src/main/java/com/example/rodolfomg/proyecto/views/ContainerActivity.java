package com.example.rodolfomg.proyecto.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rodolfomg.proyecto.R;
import com.example.rodolfomg.proyecto.views.fragments.CalendarFragment;
import com.example.rodolfomg.proyecto.views.fragments.HomeFragment;
import com.example.rodolfomg.proyecto.views.fragments.ProfileFragment;
import com.roughike.bottombar.BottomBar;

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

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottom_bar);
        bottomBar.setDefaultTab(R.id.home);
    }
}
