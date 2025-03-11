package hafta2;

public class StringMain {

    public static void main(String[] args) {
        var s = "Lavanta";

        String flower = "Papatya"; // 7 karakterden oluşur. stringler 0. indexten başlar

        int lenght = flower.length();

        System.out.println(flower + " -> " + lenght + " karakterden oluşmaktadır.");

        char firstIndex = flower.charAt(0);

        // System.out.println(firstIndex);  // char c = flower.charAt(7);

        System.out.println(flower.indexOf('a'));

        System.out.println(flower.indexOf('a',2));

        System.out.println(flower.substring(3));

        System.out.println(flower.substring(2,5));





    }
}
