package hafta1;

import java.util.Scanner;

public class ArtıkYıl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz: ");
        int yıl = scanner.nextInt();

        if ((yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0)) {
            System.out.println(yıl + " bir artık yıldır! ");
        } else {
                System.out.println(yıl + " bir artık yıl değildir! ");
            }
        }
    }



