package hafta1.loops;

public class LoopsTest {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("toplam:" + sum);


       int result = 0;

       for (int j = 0; j <= 1000; j++) {

           if (j % 5 == 0){
               System.out.println(j);
              // result = result + j;
               result += j;
           }
    }

       System.out.println("5'e bölünen sayıların toplamı: " + result);

        }

    }


