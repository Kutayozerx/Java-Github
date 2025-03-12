package hafta2.Methods;

public class ParametreliMetotlar {

    public static void main(String[] args) {
        isimYazdir();
        topla(17,5);
    }
    public static void topla(int sayı1 , int sayı2) {

        int sonuc = sayı1 + sayı2;
        System.out.println("Sonuç: " + sonuc);
    }

    public static void isimYazdir(){
        System.out.println("Kutay");
    }

}
