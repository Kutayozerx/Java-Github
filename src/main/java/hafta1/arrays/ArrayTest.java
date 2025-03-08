package hafta1.arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int [] numbers = new int[5]; //eleman sayısı
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        //numbers[7] = 30; array de bu olamaz hata alıyoruz

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);

            int[] numbers2 = {1, 2, 3, 4, 5,};

                    for (int num : numbers2) {
                        System.out.println(num);
                    }

                    String cities[] = {"İstanbul","Ankara","İzmir","Bursa","Sinop"};
                    String[] cities1 = {"İstanbul","Ankara","İzmir","Bursa","Sinop"};

                    for (String city : cities) {
                        System.out.println(city);
                    }




        }
    }
}
