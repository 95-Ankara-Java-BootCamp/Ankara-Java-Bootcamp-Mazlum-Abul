package com.mazlumabul;

import java.util.ArrayList;
import java.util.Scanner;

public   class Insan {
    private String  kullaniciAdi;
    private String  sifre;
  //  private ArrayList<Film> films;
    private Film film;
    public static Scanner scanner = new Scanner(System.in);

    public Insan(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
       // this.films = new ArrayList<Film>();

    }
    public  void filmListele(){
        System.out.println("Filmler Listelendi ");
        Admin.filmler();
    }

    public void filmSatinAl(double kredi){
        System.out.println("Film Satin Al");
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

   public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }


/*
    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

 */
}
