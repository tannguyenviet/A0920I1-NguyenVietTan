package test;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Scanner;

public class DemoOptional {
    public static void main(String[] args) {
        Integer a =  2;
        Integer b = 10;
        Optional<Integer> optionalInteger = Optional.ofNullable(a);
        System.out.println(sum(optionalInteger,b));
    };
    public static Integer sum (Optional<Integer> a, Integer b){
        Integer anotherA = a.orElse(0);
        return anotherA +b;
    }
}
