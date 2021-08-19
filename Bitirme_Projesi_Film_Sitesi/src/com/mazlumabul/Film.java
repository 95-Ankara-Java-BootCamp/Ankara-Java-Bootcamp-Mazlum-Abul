package com.mazlumabul;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private int id;
    private String filmAd;
    private String yayinYili;
    private String tur;
    private double imdb;
    private String dil;
    private double ucret;

    public Film() {
    }

    public Film(int id, String filmAd, String yayinYili, String tur, double imdb, String dil, double ucret) {
        this.id = id;
        this.filmAd = filmAd;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.imdb = imdb;
        this.dil = dil;
        this.ucret = ucret;
    }



    public String getFilmAd() {
        return filmAd;
    }

    public void setFilmAd(String filmAd) {
        this.filmAd = filmAd;
    }

    public String getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(String yayinYili) {
        this.yayinYili = yayinYili;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id +" "+
                "Ad : " + filmAd +
                        " Vizyon Tarihi : " + yayinYili +
                        " Tur : " + tur +
                        " İmdb : " + imdb +
                        " Dil :  " + dil +
                        " Ücret : " + ucret;
    }
}
