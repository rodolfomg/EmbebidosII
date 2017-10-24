package com.example.rodolfomg.proyecto.models;

/**
 * Created by rodolfo on 23/10/17.
 */


public class Album {
    private String name;
    private String band;
    private String year;
    private String image;

    public Album(){}

    public Album(String name, String band, String year, String image) {
        this.name = name;
        this.band = band;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
