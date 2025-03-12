package hafta2.Ödevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        if (sifre.length() >= 8 &&
                !sifre.contains(" ") &&
                Character.isUpperCase(sifre.charAt(0)) &&
                sifre.endsWith("?")) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }

        }







    }
