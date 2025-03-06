package hafta1._2Practices;

import java.util.Scanner;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(number < 1) {
            System.out.println("Lütfen bir veya daha büyük bir sayı giriniz.");
            return;
        }

        int number1 = 0;
        int number2 = 1;

        while (number2 <= number) {
            System.out.println(", " + number2);
            int nextnumber = number1 + number2;
            number1 = number2;
            number2 = nextnumber;
        }
    }
}
