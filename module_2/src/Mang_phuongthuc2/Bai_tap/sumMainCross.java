package Mang_phuongthuc2.Bai_tap;

import java.util.Scanner;

public class sumMainCross {
    public static void main(String[] args) {
        int[][] matrix;
        int sum = 0;
        matrix = new int[4][4];
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        //input Matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        // Print Matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // Sum Main Cross
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length;column++) {
                if (row == column) {
                    sum += matrix[row][column];
                }
            }

        }
        // Print Sum
        System.out.println(" Sum Main Cross of Matrix: " + sum);
    }
}
