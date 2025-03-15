package hafta2.oop.samples;

public class Car1 extends Object{

    private String brand;

    private String model;

    public Car1() {

    }

    public Car1(String bmw, String number) {
    }

    public Car1(String bmw) {
    }

    public void Car(String brand, String model) {
        this.brand = brand;
        this.model = model;


    }

    public void Car(){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
