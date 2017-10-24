package com.example.rodolfomg.proyecto.adapters;

/**
 * Created by rodolfo on 23/10/17.
 */

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodolfomg.proyecto.models.Album;
import com.example.rodolfomg.proyecto.R;

import java.util.ArrayList;


public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private ArrayList<Album> albums;        // Albums a mostrar en la actividad
    private int resourse;                   // Vista donde de desplegara la lista de bandas (cards)
    private Activity activity;              //

    public AlbumAdapter(ArrayList<Album> albums, int resourse, Activity activity) {
        /*
          Constructor
        */
        this.albums     = albums;
        this.resourse   = resourse;
        this.activity   = activity;
    }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*
         Crea una tarjeta (card) nueva al "inflarla" en la vista actual de la aplicacion (parent),
         regresa un objeto del tipo AlbumViewHolder con el cual manipularemos la info que se mostrará
         en cada tarjeta
        */

        View card = LayoutInflater.from(parent.getContext()).inflate(resourse, parent, false);
        return new AlbumViewHolder(card);
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {
        /*
          Modifica los valores de la tarjeta (card) actual, colocando la informacion contenida en el
          siguiente objeto Album, extrayendolo del arrayList a traves de albums.get(position)
        */

        Album album = albums.get(position);
        holder.albumCard.setText(album.getName());
        holder.bandCard.setText(album.getBand());
        holder.yearCard.setText(album.getYear());
    }

    @Override
    public int getItemCount() {
        /*
         Retorna el total de albums
        */

        return albums.size();
    }

    class AlbumViewHolder extends RecyclerView.ViewHolder {
        /*
         Un ViewHolder nos permite manipular las vistas (cards en este caso) modificando sus elementos
         o componentes de una manera sencilla, convirtiendo dichos elementos en atributos de una clase
        */

        private TextView albumCard;
        private TextView bandCard;
        private TextView yearCard;

        public AlbumViewHolder(View card) { // Recibe la tarjeta (CardView)
            super(card);
            this.albumCard  = card.findViewById(R.id.albumName);
            this.bandCard   = card.findViewById(R.id.bandName);
            this.yearCard   = card.findViewById(R.id.albumYear);
        }
    }
}