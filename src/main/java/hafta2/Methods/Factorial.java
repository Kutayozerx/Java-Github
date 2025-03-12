package hafta2.Methods;

public class Factorial {

    public static void main(String[] args) {

        int factorail = factorial(1000);

        System.out.println("Factorail: " + factorail);



    }

    public static int factorial(int number){

        if (number == 0) {
            return 1;
        }

        return number * (factorial(-1));
    }

}
