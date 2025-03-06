package hafta1.loops;

import java.util.Scanner;

public class LoopAndIfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Bu sayı pozitiftir. Sayı = " + number);
        }else if (number < 0){
            System.out.println("Bu sayı negatiftir. Sayı = " + number);
        }else {
            System.out.println("Bu sayı 0'a eşittir. Sayı = " + number);
        }
    }
}
