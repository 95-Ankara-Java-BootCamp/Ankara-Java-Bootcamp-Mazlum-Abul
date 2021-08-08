package com.mazlumabul;

public  class Insan {
    private String isim;
    private String soyisim;
    private String kullaniciAdi;
    private String sifre;

    public Insan(String isim, String soyisim, String kullaniciAdi, String sifre) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
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
}
