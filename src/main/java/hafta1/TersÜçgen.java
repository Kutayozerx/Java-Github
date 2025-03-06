package hafta1;

import java.util.Scanner;

public class TersÜçgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Ters Üçgenin Basamak sayısını giriniz: ");
        number = scanner.nextInt();


        //Ters Üçgen için döngü
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
