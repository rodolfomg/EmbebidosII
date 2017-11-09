package com.example.rodolfomg.proyecto.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rodolfomg.proyecto.R;

/**
 * Created by rodolfo on 8/11/17.
 */

public class HomeFragment extends Fragment {
    public HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, container);

        return view;
    }
}