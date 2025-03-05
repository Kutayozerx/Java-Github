package hafta1;

import java.util.Scanner;

public class ArtıkYıl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır! ");
        } else {
                System.out.println(yil + " bir artık yıl değildir! ");
            }
        }
    }


