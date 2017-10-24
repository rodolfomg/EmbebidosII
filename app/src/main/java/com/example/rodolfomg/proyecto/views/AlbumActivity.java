package com.example.rodolfomg.proyecto.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.rodolfomg.proyecto.R;
import com.example.rodolfomg.proyecto.adapters.AlbumAdapter;
import com.example.rodolfomg.proyecto.models.Album;

import java.util.ArrayList;

/**
 * Created by rodolfo on 23/10/17.
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        showToolbar(getResources().getString(R.string.main_toolbar), false);

        RecyclerView albumsRecycler = (RecyclerView) findViewById(R.id.albumRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        albumsRecycler.setLayoutManager(linearLayoutManager);

        AlbumAdapter albumAdapter = new AlbumAdapter(buildAlbums(), R.layout.cardview_band, this);

        albumsRecycler.setAdapter(albumAdapter);
    }

    public ArrayList<Album> buildAlbums(){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Album","Band","(1989)",""));
        albums.add(new Album("Another Album","Second Band","(1990)",""));
        albums.add(new Album("Some Album","My Band: Band","(1991)",""));
        albums.add(new Album("The same Album","From Another Band","(1992)",""));
        albums.add(new Album("404 Album Not Found","Just Because","(1993)",""));

        return albums;
    }

    public void showToolbar(String name, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
