package test;

public class test2  {
    static public int X = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        test2 o = new test2();
        System.out.printf("x=%d, y=%d", o.X, test2.X);
    }
}
