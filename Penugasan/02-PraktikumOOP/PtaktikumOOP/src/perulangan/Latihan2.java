package perulangan;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
