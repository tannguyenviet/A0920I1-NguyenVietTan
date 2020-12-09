package B13_thuat_toan_tim_kiem.Bai_tap.Tim_chuoi_dodai_lonnhat;

import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        Scanner sc = new Scanner(System.in);
        String st =sc.nextLine();
        System.out.println(" Chuỗi dài nhất là");
        int index = 1;
        String result ="";
        result = result +st.charAt(0);
        System.out.println((int)st.charAt(index));

        char initChar = st.charAt(0);

        System.out.println((int)initChar);
        while(index<st.length()){
            if((int)st.charAt(index)>=(int)initChar){
                result += st.charAt(index);
                initChar = st.charAt(index);
            }
            index++;
        }
//        56->c
        System.out.println(result);
    }
}
