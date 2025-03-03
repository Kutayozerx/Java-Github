package hafta1;

import java.util.Scanner;


public class VücutKitleİndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu(Metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + indeks);
    }


}
