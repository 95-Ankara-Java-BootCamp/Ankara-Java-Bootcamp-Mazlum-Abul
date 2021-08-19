package com.mazlumabul;

public class Uye extends Insan {
    private Film film;
    private double kredi;

    public Uye() {
        super("uye", "123");
    }

    public Uye(String kullaniciAdi, String sifre, double kredi) {
        super(kullaniciAdi, sifre);
        this.kredi = kredi;
    }



    public void aboneOl(){
        System.out.println("abonel Ol");
    }
    public void krediAl(){
        System.out.println("Kredi al");
    }
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public double getKredi() {
        return kredi;
    }

    public void setKredi(double kredi) {
        this.kredi = kredi;
    }
}
