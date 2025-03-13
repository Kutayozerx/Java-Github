package hafta2.Ödevler;

import java.util.Scanner;

public class AsalSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int sayı = scanner.nextInt();

        if (sayı <= 1) {
            System.out.println(sayı + " sayısı ASAL değildir! ");
        } else {
            // Asal kontrolünü başlat
            int sonuc = asalTest(sayı, sayı / 2);
            if (sonuc == 1) {
                System.out.println(sayı + " sayısı ASALDIR !");
            } else {
                System.out.println(sayı + " sayısı ASAL değildir !");
            }
        }

    }
        public static int asalTest(int sayı ,int bolen) {
            if (bolen == 1) {
            return 1;
        }
            if (sayı % bolen == 0) {
                return 0;
            }
            return asalTest(sayı, bolen - 1);
        }

}
