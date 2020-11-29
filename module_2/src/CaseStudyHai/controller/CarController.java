package com.company.controller;

import com.company.BO.CarBO;
import com.company.BO.impl.CarBOImpl;
import com.company.entity.Car;

import java.util.List;
import java.util.Scanner;

public class CarController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarBO carBO = new CarBOImpl();
        System.out.println("1. Hiển thị list" +
                "/n"+"2. Tạo mới");
        int choice =Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                List<Car> carBOList=carBO.getList();
        }
    }
}
