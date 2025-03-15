package hafta2.oop.inheritance.Example1;

public class Book extends Product {

    private String author;

    /*public Book(){
   // super classında yani product içerisinde bos bir constructor olmadığı için buraya da ekleyemezsin.
    }*/


    public Book(String name, double price) {
        super(name, price);
    }

    public Book(String name) {
        super(name);
    }
}
