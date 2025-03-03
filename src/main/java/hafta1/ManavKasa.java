package hafta1;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double ArmutFiyat =2.14;
         double ElmaFiyat =3.67;
         double DomatesFiyat =1.11;
         double  MuzFiyat =0.95;
         double PatlıcanFiyat =5.00;

         System.out.println("Mananvdan almak istediğiniz ürünlerin kilogram Miktarlarını girin: ");

        System.out.print("Armut (kg): ");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma (kg): ");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates (kg): ");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz (kg): ");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan (kg): ");
        double patlicanKg = scanner.nextDouble();

        double armutTutar = armutKg * ArmutFiyat;
        double elmaTutar = elmaKg * ElmaFiyat;
        double domatesTutar = domatesKg * DomatesFiyat;
        double muzTutar = muzKg * MuzFiyat;
        double patlicanTutar = patlicanKg * PatlıcanFiyat;

        double toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.println("Alışveris Toplam Tutarı: ");
        System.out.printf("Armut: %.2f TL\n", armutTutar);
        System.out.printf("Elma: %.2f TL\n", elmaTutar);
        System.out.printf("Domates: %.2f TL\n", domatesTutar);
        System.out.printf("Muz: %.2f TL\n", muzTutar);
        System.out.printf("Patlıcan: %.2f TL\n", patlicanTutar);
        System.out.printf("\nToplam Tutar: %.2f TL\n", toplamTutar);
    }


}
