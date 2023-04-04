package array;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        int[] nilai = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i+1) + " = ");
            nilai[i] = input.nextInt();
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil nilai[" + i + "] = " + nilai[i]);
        }
    }
}
