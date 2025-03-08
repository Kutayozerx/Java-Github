package hafta1.Ödevler;

import java.util.Scanner;

public class Aritmetikİşlemler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayıyı girin (a): ");
        double a = scanner.nextDouble();

        System.out.print("Birinci Sayıyı girin (b): ");
        double b = scanner.nextDouble();

        System.out.print("Birinci Sayıyı girin (c): ");
        double c = scanner.nextDouble();

        double sonuç = (a +b)*c-b;

        System.out.println("Sonuç: " + sonuç);
    }
}
