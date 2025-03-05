package hafta1.loops;

import java.util.Scanner;

public class DoWhileLoopTest {

    public static void main(String[] args) {
 /*
        boolean isTrue = 1<0;

        do {

            System.out.println("Bu döngü en az bir kere çalışır");

        }while (isTrue);
*/
        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        boolean isPasswordFalse = false;

        int counter = 0;

        do{
            System.out.println("Şifre giriniz: ");

            String input = scanner.nextLine();

            if (password.equals(input)){
                System.out.println("Doğru bir şifre girdiniz.");
               // isPasswordFalse = false;
            }  else {
                System.out.println("Yanlış bir ifade girdiniz.");
               // isPasswordFalse = true;
                counter++;
            }
        } while (counter < 3);

    }
}
