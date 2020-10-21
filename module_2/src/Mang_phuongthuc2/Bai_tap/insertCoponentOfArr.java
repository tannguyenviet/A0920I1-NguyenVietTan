package Mang_phuongthuc2.Bai_tap;

import java.util.Scanner;

public class insertCoponentOfArr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size+1];
        int i = 0;
        while (i < array.length-1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter element you want to insert: ");
        int insValue = scanner.nextInt();
        System.out.println("Enter index you want to insert: ");
        int index = scanner.nextInt();
        int right = size;
        while(right>index){
            array[size]=array[size-1];
            right--;
        }
        array[index]=insValue;
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size+1; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
