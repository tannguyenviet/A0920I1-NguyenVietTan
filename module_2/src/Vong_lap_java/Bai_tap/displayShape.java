package Vong_lap_java.Bai_tap;

import java.util.Scanner;

public class displayShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                for( int i =0;i<3;i++){
                    System.out.println(" * * * * * * * ");
                }
                break;
            case 2:
            for(int i=1; i<=5; i++){
                for(int j=1; j<i; j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
                break;
            case 3:
                for(int i=5; i>1; i--){
                    for(int j=i; j>1; j--){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;

        }
    }
}
