package hafta2.Ödevler;

import java.util.Scanner;

public class SayıYuvarlama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ondalıklı bir sayı giriniz: ");
        double sayı = scanner.nextDouble();

        System.out.println("Aşağı Yuavarlama: " + Math.floor(sayı));

        System.out.println("Yukarı Yuvarlama: " + Math.ceil(sayı));

        System.out.println("En yakın tam sayı: " + Math.round(sayı));





    }
}
