package hafta2.Methods;

public class Calculation {

    public void showTitle(){
        System.out.println("Hoş Geldiniz!");
    }

    public int calculateSquare(int number){
        return number * number ;
    }
    private  void addNumbers (int number1, int number2) {
        int sum = number1 + number2;

        System.out.println("Toplam: " + sum);


    }
    private  double addNumbers (double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }

    protected double addNumbers(){
        double pi = 3;
        return 10 * pi;
    }

}
