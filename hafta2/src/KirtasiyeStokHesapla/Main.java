package KirtasiyeStokHesapla;
// HAshMAp ile dinamik
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
 * Bir kırtasiye dükkanına mal geliyor.
 * Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
 * soru 1: Toplam kaç adet mal aldı.
 * soru 2: Hangi maldan kaç adet aldı.
 * soru 3: Kaç çeşit malı var.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product;

        System.out.println("Çıkış için  q ya basın" );

        List<String> products = new ArrayList<>();
        while (true){
            System.out.print("Ürün : ");
            product = scanner.next();
           if(product.equals("q")){
               break;
           }

           products.add(product);

        }
        System.out.println("Toplam ürüm miktarı : "+products.size());

        int elmaSayac=0, armutSayac=0;
        for (String urun : products) {
            if(urun.equals("kalem")){
                elmaSayac++;
            }
            if(urun.equals("silgi")){
                armutSayac++;
            }
        }
        System.out.println("Kalem sayısı : " + elmaSayac);
        System.out.println("silgi sayısı : " + armutSayac);

        HashSet<String> urunCesit = new HashSet<>();
        urunCesit.addAll(products);
        System.out.println("Ürün Çeşidi : " + urunCesit.size());
    }
}
