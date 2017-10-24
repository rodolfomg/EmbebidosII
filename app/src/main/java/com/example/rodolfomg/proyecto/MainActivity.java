package com.example.rodolfomg.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.rodolfomg.proyecto.views.AlbumActivity;
import com.example.rodolfomg.proyecto.views.CreateAccountActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToolbar(getResources().getString(R.string.main_toolbar), false);
    }

    public void showToolbar(String name, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void goToAlbums(View view){
        Intent intent = new Intent(this, AlbumActivity.class);
        startActivity(intent);
    }
}
