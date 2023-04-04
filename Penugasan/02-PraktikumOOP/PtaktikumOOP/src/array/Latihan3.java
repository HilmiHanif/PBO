package array;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = input.nextInt();

        int[] angka = new int[jumlahAngka];
        System.out.print("Masukkan angka: ");
        for (int i = 0; i < jumlahAngka; i++) {
            angka[i] = input.nextInt();
        }

        // Sorting menggunakan Bubble Sort
        for (int i = 0; i < jumlahAngka-1; i++) {
            System.out.print("Iterasi " + (i+1) + ": ");
            for (int j = 0; j < jumlahAngka-i-1; j++) {
                if (angka[j] > angka[j+1]) {
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
                System.out.print(angka[j] + " ");
            }
            System.out.println(angka[jumlahAngka-i-1]);
        }

        // Output hasil sorting
        System.out.print("\nHasil sorting: ");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
