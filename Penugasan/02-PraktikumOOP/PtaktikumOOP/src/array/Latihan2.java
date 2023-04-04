package array;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        String[] namaSiswa = new String[jumlahSiswa];
        double[] nilaiUjian = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i+1) + ": ");
            namaSiswa[i] = input.next();

            System.out.print("Masukkan nilai ujian siswa ke-" + (i+1) + ": ");
            nilaiUjian[i] = input.nextDouble();
        }

        System.out.println("\nDaftar Nilai Siswa");
        daftarNilai(namaSiswa, nilaiUjian);
    }

    public static void daftarNilai(String[] namaSiswa, double[] nilaiUjian) {
        System.out.println("==============================");
        System.out.println("| No |    Nama    | Nilai Ujian |");
        System.out.println("==============================");

        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.printf("| %2d | %-10s | %10.2f |\n", (i+1), namaSiswa[i], nilaiUjian[i]);
        }

        System.out.println("==============================");
    }
}


