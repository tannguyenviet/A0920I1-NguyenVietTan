package B3_mang_phuongthuc.Bai_tap;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        int [] array1;
        int [] array2;
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array 1 : ");
        int size1 = sc.nextInt();
        System.out.println("Enter size of Array 2 : ");
        int size2 = sc.nextInt();
        array1 = new int[size1];
        array2 = new int[size2];
        array =  new int[size1+size2];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + " of Array 1: ");
            array1[i] = sc.nextInt();
            i++;
        }
        i =0;
        while (i < array2.length) {
            System.out.print("Enter element " + (i + 1) + " of Array 2: ");
            array2[i] = sc.nextInt();
            i++;
        }
        for( i =0;i<size1;i++){
            array[i]=array1[i];
        }
        for( i =size1;i<size1+size2;i++){
            array[i]=array2[i-size1];
        }

        for(i =0;i<size1+size2;i++){
            System.out.print(array[i]+" ");
        }
    }
}
