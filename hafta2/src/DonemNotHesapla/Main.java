package DonemNotHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vizeScore= 0,finalScore =0, average = 0;

        System.out.print("Vize : ");
        vizeScore = scanner.nextDouble();

        System.out.print("Final : ");
        finalScore = scanner.nextDouble();

        average = (vizeScore*0.20) + (finalScore*0.70);

       if((vizeScore<0 && vizeScore>100) || (finalScore<0 && finalScore>100)) {
           System.out.println("Vize veya Final 0-100 arasında olmalı ");
       } else {
           if(average>=0 && average <20){
               System.out.println("Ortalama : " + average + " Harf : FF");
           } else if(average>=20 &&  average <50){
               System.out.println("Ortalama : " + average + " Harf : CB");
           }else if(average>=50 &&  average <70){
               System.out.println("Ortalama : " + average + " Harf : BB");
           } else if(average>=70 &&  average <=100){
               System.out.println("Ortalama : " + average + " Harf : AA");
           }
       }

    }
}
