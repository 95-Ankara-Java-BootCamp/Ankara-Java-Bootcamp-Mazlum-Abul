package OrtalamaHesapla;

import java.util.Scanner;

public class MainMethod {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double vizeScore,finalScore, average ;
        System.out.print("Vize : ");
        vizeScore = scanner.nextDouble();

        System.out.print("Final : ");
        finalScore = scanner.nextDouble();

        checkVizeFinal(vizeScore,finalScore);

    }

    public static double averageCalc(double vizeScore,double finalScore){
        double average = (vizeScore * 0.3) + (finalScore * 0.7);
        System.out.println("Ortalama : " + average);
        return average;
    }
    public static boolean checkVizeFinal(double vizeScore, double finalScore){
        if((vizeScore<0 || vizeScore>100) || (finalScore<0 || finalScore>100)) {
            System.out.println("Vize veya Final 0-100 arasında olmalı ");
            return false;
        } else{
            averageCalc(vizeScore,finalScore);
            return true;
        }


    }


}
