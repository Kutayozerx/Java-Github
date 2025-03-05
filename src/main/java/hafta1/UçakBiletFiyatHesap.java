package hafta1;

import java.util.Scanner;

public class UçakBiletFiyatHesap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int yaş = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();


        if ( mesafe <= 0 || yaş <= 0 || (yolculukTipi !=1 && yolculukTipi !=2)) {
            System.out.println("Hatalı veri girdiniz!");
        }  else {

            double normalFiyat = mesafe * 0.10;

            double yaşİndirimliFiyat = normalFiyat;
            if (yaş < 12) {
             yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.50;
        }else if (yaş >= 12 && yaş <= 24) {
            yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.10;
        }else if (yaş > 65) {
            yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.30;
        }

            double finalFiyat = yaşİndirimliFiyat;
        if (yolculukTipi == 2) {
            finalFiyat = yaşİndirimliFiyat - yaşİndirimliFiyat * 0.20;
        }
        if (yolculukTipi == 2) {
            finalFiyat *= 2;
        }

            System.out.println("Toplam Tutar = " + finalFiyat + " TL");

        }
    }

    }

