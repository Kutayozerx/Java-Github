package hafta1.Examples;

import java.util.Scanner;

public class PassByValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dizi = {1,2,3,4,5};
        System.out.println("ilk değer " + dizi[0]);
        degistir(dizi);
        System.out.println("son değer " + dizi[0]);
    }

    static void degistir(int[] dizi) {
        dizi[0] = dizi[0] + 10;
    }

}
