package hafta2.oop.samples;

public class Car extends Object{

    private String brand;

    private String model;

    public Car() {

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;


    }

    public Car(){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
