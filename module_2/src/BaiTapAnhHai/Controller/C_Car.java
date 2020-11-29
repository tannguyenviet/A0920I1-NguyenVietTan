package BaiTapAnhHai.Controller;

import BaiTapAnhHai.BO.B_Car;
import BaiTapAnhHai.BO.impl.BImpl_Car;
import BaiTapAnhHai.Entity.Car;

import java.util.List;
import java.util.Scanner;

public class C_Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        BImpl_Car bImpl_car = new BImpl_Car();
        System.out.println("1. Xem danh sách Car");
        System.out.println("2. Thêm một Car");
        switch (choice){
            case 1:
                // do st do st
                break;
            case 2:
                break;
            default:
        }
    }
}
