package B18_threading.Bai_tap.Palidrome;

public class main {
    public static void main(String[] args) {
        LazyPrimeFactorization t1 = new LazyPrimeFactorization();
        OptimizedPrimeFactorization t2 = new OptimizedPrimeFactorization();
        t1.start();
        t2.start();
    }
}
