package hafta2.oop.Ders;

public class CarTest {

    public static void main(String[] args) {

        Car bmw = new Car();

        bmw.setBrand("BMW");
        bmw.setModel("320");
        bmw.setMaxSpeed(285);
        bmw.setHorsePower(180);

        bmw.move();
        bmw.incrementGear(2);
        int gear = bmw.getGear();

        System.out.println(gear);

       // Vehicle vehicle = new Vehicle(); // soyut class ve interfaceden nesne oluşturulamaz.



    }
}
