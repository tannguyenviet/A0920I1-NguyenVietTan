package Nhap_mon_lap_trinh.Bai_tap;

import java.util.Scanner;

public class displayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello: " + name);
    }
}
