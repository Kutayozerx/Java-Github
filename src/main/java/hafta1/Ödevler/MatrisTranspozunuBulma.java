package hafta1.Ödevler;

import java.util.Scanner;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix'in satır sayısını giriniz: ");
        int satır = scanner.nextInt();
        System.out.println("Matrix'in sütun sayısını giriniz: ");
        int sütun= scanner.nextInt();

        int[][] matris = new int[satır][sütun];
        System.out.println("Matrisin elemanlarını girin: ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }
        int[][] transpoz = new int[sütun][satır];

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
            System.out.println("Matris: ");
            for (int i = 0; i < satır; i++) {
                for (int j = 0; j < sütun; j++) {
                    System.out.print(matris[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Transpoze: ");
            for (int i = 0; i < sütun; i++) {
                for (int j = 0; j < satır; j++) {
                    System.out.print(transpoz[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
