package perulangan;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        int faktorial = 1;
        for (int i = 1; i <= bilangan; i++) {
            faktorial *= i;
            System.out.println(i + " x " + (i == 1 ? "" : i - 1) + " = " + faktorial);
        }
        System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
    }
}
