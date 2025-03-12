package hafta2.Methods;

public class MethodTest {

    public static void main(String[] args) {

        // addNumbers(5,7);

        // double sum = addNumbers(6,4 , 15);
        Calculation calculation = new Calculation();
        calculation.showTitle();

        int square = calculation.calculateSquare(5);
        System.out.println("Square: " + square);

        // calculation.addNumbers(5,6);

        // System.out.println(addNumbers);

    }
}