package B2_Vong_lap_java.Bai_tap;

public class displayPrimeSmall100 {
    public static void main(String[] args) {

        int run =2;
        while (run<=100){
            boolean check = true;

            for (int i =2;i<=Math.sqrt(run);i++){
                if (run%i==0){
                    check= false;
                    break;
                }
            }
            if(check==true){
                System.out.println(run + " " );
            }
            run++;

        }
    }
}
