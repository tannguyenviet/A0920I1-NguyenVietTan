package Mang_phuongthuc2.Bai_tap;

import java.util.Scanner;

public class deleteComponentOfArray {
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
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter element you want to delete: ");
        int delValue = scanner.nextInt();
        int right = size-1;
        int left = 0;
        int temp;

        // 1 2 5 6 2 5
        while(left<=right){
            if (array[left]==delValue){
                for(int j = left;j<=right;j++){
                    if(j==right){
                    }
                    else{
                        array[j]=array[j+1];
                    }
                }
                right--;
                size--;
            }
            else{
                left ++;
            }

        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
