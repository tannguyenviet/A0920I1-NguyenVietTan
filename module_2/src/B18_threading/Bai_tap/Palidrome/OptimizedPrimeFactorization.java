package B18_threading.Bai_tap.Palidrome;

public class OptimizedPrimeFactorization  extends  Thread{
    @Override
    public void run() {
        int x=2;
        boolean check=true;
        while (true){
            check=true;
            for(int i =2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    check =false;
                    break;
                }
            }
            if(check==true){
                System.out.println("Opti > " +x);
            }
            x++;
        }
    }
}
