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
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_album);
        showToolbar("Albums", false);

        // Creamos nuestro Recycler usando la etiqueta RecyclerView en activity_album
        RecyclerView albumsRecycler = (RecyclerView) findViewById(R.id.albumRecyclerView);

        /*
          Creamos nuestro LLM que nos ayudara a acomodar/ordenar nuestros elementos (CardView) a
          manera de lista VERTICAL
         */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // Incluimos nuesto LLM en nustro RecyclerView
        albumsRecycler.setLayoutManager(linearLayoutManager);

        /*
          Creamos nuestro adapter el cual recibe: AlbumAdapter(ListaAlbums, CardView, Activity)
            - ListaAlbums: albums que mostraremos en nuestro RecyclerView
            - CardView: Layout donde acomodaremos la informacion de nuestros albums
            - Activity: Actividad actual, donde se muestra el RecyclerView
         */
        AlbumAdapter albumAdapter = new AlbumAdapter(getAlbums(), R.layout.cardview_album, this);

        // Incluimos nuestro Adapter en el RecyclerView
        albumsRecycler.setAdapter(albumAdapter);
    }

    public ArrayList<Album> getAlbums(){
        ArrayList<Album> albums = new ArrayList<>();

        // Obtener la informacion de la BD o Internet
        albums.add(new Album("Album", "Band", "Year", ""));
        albums.add(new Album("Album", "Band", "Year", ""));
        albums.add(new Album("Album", "Band", "Year", ""));
        albums.add(new Album("Album", "Band", "Year", ""));
        albums.add(new Album("Album", "Band", "Year", ""));

        return albums;
    }

    public void showToolbar(String name, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
