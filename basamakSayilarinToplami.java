package basamakSayiToplami;
import java.util.Scanner;

public class basamakSayiToplami {
    public static void main(String[] args) {
           /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */
        int sayi , total = 0, tempsayi = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen Bir sayı Girin: ");
        sayi = input.nextInt();
        tempsayi=sayi;
        while (tempsayi != 0) {
            total += tempsayi % 10;
            tempsayi /= 10;
        }
        System.out.println("Girilen Sayının Sayı değerleri Toplamı.: " + total);
    }
}
