package B3_mang_phuongthuc.Bai_tap;

import java.util.Scanner;

public class sumColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix;
        int sum=0;
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

        System.out.println("Enter column you want to Sum");
        int indexColumn = sc.nextInt();
        // Sum column
        for(int row =0;row<matrix.length;row++){
            sum+=matrix[row][indexColumn];
        }
        System.out.println("Sum value : "+sum);
    }
}
