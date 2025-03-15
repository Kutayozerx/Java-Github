package hafta2.oop.inheritance.Example1;

public class Electronic extends Product {//Product electroniğin üst klassıdır.

   private int warrantyPeriod;

   public Electronic(String name){
       super(name);
   }
    public int Electronic(String name, double price){
        //super(name,price);


    //public int getWarrantyPeriod;() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
