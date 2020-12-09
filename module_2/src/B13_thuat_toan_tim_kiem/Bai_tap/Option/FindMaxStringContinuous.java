package B13_thuat_toan_tim_kiem.Bai_tap.Option;

import java.util.Scanner;

public class FindMaxStringContinuous {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi");
        Scanner sc = new Scanner(System.in);
        String st =sc.nextLine();
        System.out.println(" Chuỗi dài nhất là");
        int index = 1;
        String result ="";
        int[] arrNote = new int[20];
        char initChar = st.charAt(0);
        int init =0;
        int maxIndex=0;
        int max =0;
        while(index<st.length()){
            if((int)st.charAt(index)>=(int)initChar){
                init ++;
                arrNote[index]=init;
                initChar = st.charAt(index);
            }
            else{
                initChar=st.charAt(index);
                init=0;
            }
            index++;
        }

        for(int i=0;i<arrNote.length;i++){
            if(arrNote[i]>max){
                maxIndex=i;
                max =arrNote[i];
            }
        }
        System.out.println(st.substring(maxIndex-max,maxIndex+1));

    }
}
