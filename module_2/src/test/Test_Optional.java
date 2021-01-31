package test;

import java.util.Optional;

public class Test_Optional {
   
    public static void main(String[] args) {
        A a = null;
        Optional<A> optionalA = Optional.ofNullable(a);
        optionalA.ifPresent(a1 -> System.out.println("hello"));
    }
}
