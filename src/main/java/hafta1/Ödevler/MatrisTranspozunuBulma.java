package hafta1.Ödevler;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {

        int[][] matris = new int[2][3];

        matris [0][0] = 1;
        matris [0][1] = 2;
        matris [0][2] = 3;

        matris [1][0] = 4;
        matris [1][1] = 5;
        matris [1][2] = 6;

        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpoze: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[j].length; j++) {
                System.out.print(matris[j][i] + "\t");
            }
            System.out.println();
        }
    }
}