package B3_mang_phuongthuc.Bai_tap;

import java.io.IOException;
import java.util.Scanner;

public class countCharacterInString {
    public static void main(String[] args) {
        int count = 0;
        char c = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println(" Enter String: ");
        String st = sc.nextLine();
        System.out.println("Enter Character: ");

        // input Char
        //Scanner s= new Scanner(System.in);
        //char x = s.next().charAt(0);
        try {
             c = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0;i<st.length();i++){
            
            if(st.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
