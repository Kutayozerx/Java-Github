package hafta2.Ödevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        if (sifre.length() < 8) {
            System.out.println("Geçersiz Şifre.");
        }

        if (sifre.contains(" ")) {
            System.out.println("Geçersiz Şifre");
        }
        // if ()






    }


}
