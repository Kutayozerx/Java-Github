package hafta2.Methods;

public class Fibonacci {

    public static void main(String[] args) {
    int fibonacci = fibonacci(9);

        System.out.println("Fibonacci sayısı: " + fibonacci);

    }
    // 0,1,1,2,3,5,8,13,21,34
    private static int fibonacci(int number){

        if(number == 0){
            return 0;
        } else if (number == 1) {
            return 1;
        }else {
            return fibonacci(number -1) + fibonacci(number - 2);
        }

    }

}
