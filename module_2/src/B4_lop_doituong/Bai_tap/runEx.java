package B4_lop_doituong.Bai_tap;

import java.util.Scanner;

public class runEx {
    public static void runRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    public static void runSolveEquation() {
        QuadraticEquation equation = new QuadraticEquation(0, -3, 2);
        if (equation.getA() == 0) {
            if (equation.getB() == 0) {
                System.out.println("Root is 0");
            } else {
                System.out.println("Root is =" + (-equation.getC() / equation.getB()));

            }
        } else {
            equation.findDelta();
            if (equation.getDelta() < 0) {
                System.out.println("No Solution");
            } else if (equation.getDelta() == 0) {
                System.out.println("Equation have two root same:" + (-equation.getDelta() / equation.getA() * 2));
            } else {
                System.out.println(" Root 1: " + equation.root1());
                System.out.println(" Root 2: " + equation.root2());
            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. get Perimeter Rectangle ");
            System.out.println("2. get Solve Equation  level 2 ");
            System.out.println("3. get Stop Watch ");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    runRectangle();
                    break;
                case 2:
                    runSolveEquation();
                    break;
                case 3:
                    break;
                default:
            }
        }
        while (choice!=0);

        }



    }

