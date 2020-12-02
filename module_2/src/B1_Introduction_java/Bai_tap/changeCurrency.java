package B1_Introduction_java.Bai_tap;

import java.util.Scanner;

public class changeCurrency {
    public static void main(String[] args) {
        int rate =23000;
        Scanner sc = new Scanner(System.in);
        int usd = sc.nextInt();
        System.out.println(usd*rate);
    }
}
