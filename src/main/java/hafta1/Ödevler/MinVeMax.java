package hafta1.Ödevler;

import java.util.Scanner;

public class MinVeMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan sayı alınır
        System.out.println("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();


        int toplam = 0;
        int sayac = 0;

        //0 dan girilen sayıya kadar olan döngü
        for (int i = 0; i < sayı; i++) {
            if (i % 3 == 0 && i % 4 == 0) {  // 3 ve 4' bölünen sayıların kontrolü
                toplam += i;
                sayac++;
            }
        }

        // eğer 3 ve 4'e bölünen sayılar varsa ortalamayı bulur.
        if (sayac > 0) {
        double ortalama = (double) toplam / sayac;
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması " + ortalama);
        }else {
        System.out.println("3'e ve 4'e tam bölünen sayı yok.");
    }
  }
}
