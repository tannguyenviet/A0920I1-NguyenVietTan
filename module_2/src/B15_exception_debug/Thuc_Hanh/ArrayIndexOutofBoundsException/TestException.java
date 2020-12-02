package B15_exception_debug.Thuc_Hanh.ArrayIndexOutofBoundsException;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        ArrayExample arrexample = new ArrayExample();
        Integer[] arr = arrexample.createArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 số ");
        int i= sc.nextInt();
        try{
            System.out.println(arr[i]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Vượt quá giá trị của mảng");
        }
    }
}
