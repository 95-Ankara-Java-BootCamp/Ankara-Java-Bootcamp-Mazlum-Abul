package FibonacciSerisi;

import java.util.Scanner;
// girilen değere kadar fibonacci serisini yazdır
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elemanSayisi;
        System.out.print("Eleman sayısı : ");
        elemanSayisi = scanner.nextInt();
        int number1 = 0, number2 = 1, number3;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(number1 + " + ");
            System.out.print(number2 + " = ");

            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;

        }
    }
}
