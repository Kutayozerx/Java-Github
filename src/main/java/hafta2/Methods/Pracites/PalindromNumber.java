package hafta2.Methods.Pracites;

import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {

        //Palindrom
        //121 -> 121 bu sayı palindromdur.
        //123 -> 321 bu sayı palindrom değildir

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);

        if (isPalindromNumber){
            System.out.println(number + " bir palindrom sayıdır.");
        }else{
            System.out.println(number + " bir palindrom değildir.");
        }

    }

    private static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0){
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

}
