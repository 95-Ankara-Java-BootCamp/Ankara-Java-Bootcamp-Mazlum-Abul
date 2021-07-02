package OkulPuani;
// Aldığı nota göre hangi harf aldığını veren program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        double not = scanner.nextDouble();

        if(not>=0 && not <=100 ){
            if (not >=0 || not <35) {
                System.out.println("Notunuz FF");
            } else if(not >=35 || not <50){
                System.out.println("Notunuz DC");
            } else if(not >=50 || not <60){
                System.out.println("Notunuz CC");
            } else if(not >=60 || not <70){
                System.out.println("Notunuz CB");
            }else if(not >=70 || not <80){
                System.out.println("Notunuz BB");
            }else if(not >=80 || not <90){
                System.out.println("Notunuz BA");
            }else if(not >=90 || not <100){
                System.out.println("Notunuz AA");
            }
        } else {
            System.out.println("0 - 100 arasnda bir sayi giriniz ");
        }



    }
}
