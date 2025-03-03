package hafta1;

import java.util.Scanner;


public class CircleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını girin: ");
        double radius = scanner.nextDouble();

        double PI = 3.14159;

        double area = PI * radius * radius;
        double circumconference = 2 * PI * radius;

        double area2 = Math.PI * radius * radius;
        double circumconference2 = 2 * Math.PI * radius;

        System.out.println("Dairenin alanları: " + area + " - " + area2);
        System.out.println("Dairenin çevresi: " + circumconference + circumconference2);

    }

}
