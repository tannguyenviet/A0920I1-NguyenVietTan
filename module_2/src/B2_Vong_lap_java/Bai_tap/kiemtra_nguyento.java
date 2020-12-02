package B2_Vong_lap_java.Bai_tap;

import java.util.Scanner;

public class kiemtra_nguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
