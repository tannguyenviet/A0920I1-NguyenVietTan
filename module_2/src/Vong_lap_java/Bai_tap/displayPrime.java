package Vong_lap_java.Bai_tap;

public class displayPrime {
    public static void main(String[] args) {
        int n =20;
        int run =2;
        int count =1;
        while (count<=n){
            boolean check = true;

            for (int i =2;i<=Math.sqrt(run);i++){
                if (run%i==0){
                    check= false;
                    break;
                }
            }
            if(check==true){
                System.out.println(run + " " );
                count++;
            }
            run++;

        }
    }
}
