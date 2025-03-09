package hafta1.Ödevler;

import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int tamsayı = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz: ");
        double ondalıklısayı = scanner.nextDouble();

        double ondalıklısayı2 = tamsayı;

        int tamsayı2 = (int) ondalıklısayı;


        System.out.println("Tam sayıdan ondalıklı sayıya dönüşüm: " + ondalıklısayı2);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüşüm: " + tamsayı2);
    }
}
