package hafta1.loops;

import java.util.Scanner;

public class WhileLoopTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        while (true) {

            System.out.println("Şifreyi girin: ");

            String input = scanner.nextLine();

            if (password.equals(input)) {
                System.out.println("Doğru şifre girdiniz.");
            break;
            }else {
                System.out.println("Yanlış şifre girdiniz");
            }
        }
    }
}
