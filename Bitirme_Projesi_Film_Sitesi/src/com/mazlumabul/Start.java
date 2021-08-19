package com.mazlumabul;


import java.util.Scanner;

public class Start {
    private Scanner scanner = new Scanner(System.in);

    public void girisYap() {
        int secim=0;
        boolean durum = true;
        while (durum) {
            System.out.println("Hoşgeldiniz");

            System.out.println(" 1 - Admin Giriş");
            System.out.println(" 2 - Film Satın Al");  // --> ÖDeme yap
            System.out.println(" 3 - Abone Ol    -- Abone olanlar kullanıcılar aynı zamanda film kiralayabilir.");
            System.out.println(" 4 - Abone Giris");
            System.out.println(" 5 - Çıkış Yap ");

            System.out.print("İşlem seçiniz : ");
            try {
                 secim = scanner.nextInt();
            }catch (Exception e){
              durum = false;
            }

            switch (secim) {
                case 0:
                    System.out.println("Hatalı seçim...Program sonlandırılıyor ");
                    break;
                case 1:
                    Admin admin = new Admin();
                    admin.adminGirisYap();
                    break;
                case 2:
                Insan uye = new Uye();
                uye.filmSatinAl();
                case 5:
                    durum = false;
                    break;


            }
        }

    }


}
