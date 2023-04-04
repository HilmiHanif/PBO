package array;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowsA, colsA, rowsB, colsB;

        System.out.print("Enter the number of rows of matrix A: ");
        rowsA = input.nextInt();

        System.out.print("Enter the number of columns of matrix A: ");
        colsA = input.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the number of rows of matrix B: ");
        rowsB = input.nextInt();

        System.out.print("Enter the number of columns of matrix B: ");
        colsB = input.nextInt();

        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Matrix addition");
        System.out.println("2. Matrix multiplication");

        int choice = input.nextInt();
        int[][] result;

        switch (choice) {
            case 1:
                if (rowsA == rowsB && colsA == colsB) {
                    result = new int[rowsA][colsA];
                    for (int i = 0; i < rowsA; i++) {
                        for (int j = 0; j < colsA; j++) {
                            result[i][j] = matrixA[i][j] + matrixB[i][j];
                        }
                    }
                    System.out.println("Result:");
                    for (int i = 0; i < rowsA; i++) {
                        for (int j = 0; j < colsA; j++) {
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Matrix addition is not possible.");
                }
                break;
            case 2:
                if (colsA == rowsB) {
                    result = new int[rowsA][colsB];
                    for (int i = 0; i < rowsA; i++) {
                        for (int j = 0; j < colsB; j++) {
                            for (int k = 0; k < colsA; k++) {
                                result[i][j] += matrixA[i][k] * matrixB[k][j];
                            }
                        }
                    }
                    System.out.println("Result:");
                    for (int i = 0; i < rowsA; i++) {
                        for (int j = 0; j < colsB; j++) {
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Matrix multiplication is not possible.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
