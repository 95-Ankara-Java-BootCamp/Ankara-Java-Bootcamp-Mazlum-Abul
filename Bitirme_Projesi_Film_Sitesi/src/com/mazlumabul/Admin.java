package com.mazlumabul;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Admin extends Insan{
    static   List<Film> filmList = new ArrayList<>();

    public Admin() {
        super("user", "123456");
    }

    public void adminGirisYap(){
       boolean uyeMi = true;
       while (uyeMi){
           System.out.print("Kullanıcı Adı : ");
           setKullaniciAdi(scanner.nextLine());

           System.out.print("Şifre : ");
           setSifre(scanner.nextLine());

           if (getKullaniciAdi().equals("user")  && getSifre().equals("12345")){

               adminPanel();
               uyeMi = false;
           } else {
               System.out.println("Kullanıcı Adı veya Şifre Yanlış. Tekrar Deneyin");
           }
       }
    }

    public void adminPanel(){
      boolean durum = true;
       while (durum){
           System.out.println(getKullaniciAdi() + " Admin Paneline Hoşgeldin");
           System.out.println("1 - Film Listele \n2 - Film Ekle \n3  - Çıkış Yap");
           System.out.print("İşlem : ");
           int islem = scanner.nextInt();

           switch (islem){
               case 1:
                   filmListele();
                   break;
               case 2:
                   filmEkle();
                   break;
               case 3:
                   System.out.println("Bir üst menüye dönülüyor");
                   durum = false;
                   break;

           }

       }
    }
    public static void saveToDB(Film film){
        filmList.add(film);
    }

    public static void filmEkle() {


        System.out.println("Film Ekleme İşlemleri");

        System.out.print("Id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Film Adı    : ");
        String filmAd = scanner.nextLine();
        System.out.print("Vizyon Yılı : ");
        String yayinYil = scanner.nextLine();
        System.out.print("Tür         : ");
        String tur = scanner.nextLine();
        System.out.print("Imdb Puanı  : ");
        double imdb = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dil         : ");
        String dil = scanner.nextLine();
        System.out.print("Ücret       : ");
        double ucret = scanner.nextDouble();

        Film film1=new Film();
/*        for (Film film: filmList) {
            film.setId(id);
            film.setFilmAd(filmAd);
            film.setYayinYili(yayinYil);
            film.setTur(tur);
            film.setImdb(imdb);
            film.setDil(dil);
            film.setUcret(ucret);
            id++;
            film1=film;

        }*/


           film1.setId(id);
            film1.setFilmAd(filmAd);
            film1.setYayinYili(yayinYil);
            film1.setTur(tur);
            film1.setImdb(imdb);
            film1.setDil(dil);
            film1.setUcret(ucret);



        filmler();
        // ?? filmler listesine nasıl ekleme yapacam
        if(Objects.nonNull(film1)){
            saveToDB(film1);
        }else{
            System.out.println("bir hata vardır lütfen kontrol ediniz ");
        }

    }

    public static List<Film> filmler() {
        System.out.println( "Filmler ");

       /* filmList.add(new Film(1,"Karayip Korsanları  ", "2010", "Aksiyon     ", 9, "ENG", 25));
        filmList.add(new Film(2,"Titanic             ", "2001", "Tarihi      ", 10, "ENG", 10));
        filmList.add(new Film(3,"Mr Nobody           ", "2008", "Bilim Kurgu ", 7, "ENG", 12));
        filmList.add(new Film(4,"Eşkiya              ", "1999", "Aksiyon     ", 9, "TR", 50));
        filmList.add(new Film(5,"Soysuzlar Çetesi    ", "2002", "Aksiyon     ", 7, "ENG", 10));
        filmList.add(new Film(6,"Soysuzlar Çetesi    ", "2002", "Aksiyon     ", 7, "ENG", 10));
        filmList.add(new Film(7,"303                 ", "2019", "Psikoloji   ", 9, "ENG", 75));*/

        for (Film film : filmList) {
            System.out.println(film.toString());
        }

        return filmList;
    }

}
