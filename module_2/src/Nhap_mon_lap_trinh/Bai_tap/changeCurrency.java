package Nhap_mon_lap_trinh.Bai_tap;

import java.util.Scanner;

public class changeCurrency {
    public static void main(String[] args) {
        int rate =23000;
        Scanner sc = new Scanner(System.in);
        int usd = sc.nextInt();
        System.out.println(usd*rate);
    }
}
