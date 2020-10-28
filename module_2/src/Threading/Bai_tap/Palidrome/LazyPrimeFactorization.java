package Threading.Bai_tap.Palidrome;

public class LazyPrimeFactorization extends Thread {
    @Override
    public void run() {
        int x=2;
        boolean check=true;
        while (true){
            check=true;
            for(int i =2;i<x-1;i++){
                if(x%i==0){
                    check =false;
                    break;
                }
            }
            if(check==true){
                System.out.println("Lazy > " +x);
            }
            x++;
        }
    }
}
