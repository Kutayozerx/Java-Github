package hafta1.loops;

import java.util.Scanner;

public class LoopsAndIfExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktoriel için bir sayı giriniz: ");

        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(number + "! = " + factorial);
    }
}
