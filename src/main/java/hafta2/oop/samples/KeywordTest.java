package hafta2.oop.samples;

public class KeywordTest {

    public static void main(String[] args) {
      Car1 car = new Car1();
        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        Car1 car1 = new Car1("BMW");
        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        Car1 car2 = new Car1("BMW","320");
        System.out.println(car.getModel());
        System.out.println(car.getBrand());

    }




}
