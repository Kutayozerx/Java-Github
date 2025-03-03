package hafta1;

import java.util.Scanner;


public class TempratureExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius cinsinden sıcaklık girin: ");
        double celsius = scanner.nextDouble();

        double f = (celsius * 1.8) + 32;

        System.out.println("C -> F : " + f);
    }


}
