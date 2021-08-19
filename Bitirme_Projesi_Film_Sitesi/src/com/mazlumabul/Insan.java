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

    public void filmSatinAl(){
        boolean durum = true;
        while (durum){
            System.out.println("Film Satin Al Paneli");
            Admin.filmler();

            System.out.print("İzlemek istediğiniz filmin numarasını girin :  ");
            int secim = scanner.nextInt();

            if(film.getId() == secim ){
                System.out.println(film.getFilmAd() + " aldınız. Tebrikler");
                durum= false;
            } else {
                System.out.println("Böyle bir film yok. Tekrar deneyin. ");
            }
        }

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
