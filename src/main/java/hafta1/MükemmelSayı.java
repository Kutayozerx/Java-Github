package hafta1;

import java.util.Scanner;

public class MükemmelSayı {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0) {
                toplam += i;
            }
       }

    if (toplam == sayı) {
        System.out.println(sayı + " Sayısı Mükemmel bir sayıdır.");
    } else {
        System.out.println(sayı + " Sayısı Mükkemmel bir sayı değildir.");
    }

    }
}
