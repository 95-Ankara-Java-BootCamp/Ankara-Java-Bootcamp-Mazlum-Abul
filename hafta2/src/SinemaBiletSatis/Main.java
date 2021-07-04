package SinemaBiletSatis;

import java.util.Scanner;

/*
Soru :
Sinema bileti satışı :
18 yaş altı için %10
18 ve 25 yaş arası %5 indirim
ayrıca korku filmi seçilmişse ayrıca %10 indirim
 */
public class Main {
   static double ticketPrice = 1000;
   static String selected;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Kategori seçiniz");
        System.out.println("1 - Korku\n2 - Aksiyon\n3 - Dram");
        selected = scanner.nextLine();
        filmKategoriFee(selected);

        System.out.print("Yaşınız :");
        int age = scanner.nextInt();
        feeCalc(age);

        System.out.println("Bilet Fiyatı"+ ticketPrice);

    }
    public static double filmKategoriFee(String selected){
        if (selected.equals("1")){
            ticketPrice = (ticketPrice)-(ticketPrice*0.10);
        }
        return ticketPrice;
    }
    public static   double feeCalc(int age){
        if(age<=18){
            ticketPrice = (ticketPrice)-(ticketPrice*0.10);
        } else if(age >18 && age <=25){
            ticketPrice = (ticketPrice)-(ticketPrice*0.05);
        }
        return ticketPrice;
    }
}
