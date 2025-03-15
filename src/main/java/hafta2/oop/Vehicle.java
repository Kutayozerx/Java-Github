package hafta2.oop;

public interface Vehicle {

    public void start();  // public kullanımı gereksiz çünkü doğası gereği methodlar publictir.


    private void stop() {
        //kod varlığı önemli değil
        //java 8 öncesinde bu tanım hatalı
    }
    default void stop1() {
        // java 8 öncesinde interface içerisinde default method tanımı yapılamazdı.
    }

    // default void stop2() ; // default bodysi olmayan method tanımı yapılamaz.


}
