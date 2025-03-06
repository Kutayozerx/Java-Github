package hafta1;

import java.util.Scanner;

public class UçakBiletFiyatHesap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mesafeyi km türünden girmesini istiyoruz
        System.out.println("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        //Yaş girmesini istiyoruz
        System.out.println("Yaşınızı giriniz: ");
        int yaş = scanner.nextInt();

        //Yolculuk tipini girmesini istiyoruz
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();


        // Eğer girdiği değerler yanlışsa hatalı olduğunu söylüyoruz
        if ( mesafe <= 0 || yaş <= 0 || (yolculukTipi !=1 && yolculukTipi !=2)) {
            System.out.println("Hatalı veri girdiniz!");
        }  else {

            // normal fiyatı belirliyoruz
            double normalFiyat = mesafe * 0.10;

            //Yaşa göre uygulanacak olan indirimler
            double yaşİndirimliFiyat = normalFiyat;
            if (yaş < 12) {
             yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.50;
        }else if (yaş >= 12 && yaş <= 24) {
            yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.10;
        }else if (yaş > 65) {
            yaşİndirimliFiyat = normalFiyat - normalFiyat * 0.30;
        }
            //Yolculuk tipine göre uygulanacak olan indirimler
            double finalFiyat = yaşİndirimliFiyat;
        if (yolculukTipi == 2) {
            finalFiyat = yaşİndirimliFiyat - yaşİndirimliFiyat * 0.20;
        }
        if (yolculukTipi == 2) {
            finalFiyat *= 2;
        }
            //Sonucu ekrana yazdırıyoruz
            System.out.println("Toplam Tutar = " + finalFiyat + " TL");

        }
    }

    }

