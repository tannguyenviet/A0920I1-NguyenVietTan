package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestFunctionalInterfacec {
    static List<String> list ;

    public static void main(String[] args) {
        Exception e;
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(0);
        list.add(-2);
        list.add(3);
        // lệnh removeIf sẽ thực hiện duyệt từng phần tử,
        // nếu method test của Predicate trả về true thì sẽ remove phần tử đó khỏi list
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        });
        list.forEach(t -> System.out.println(t));
        System.out.println("-----------------------------");
        // Sử dụng Predicate với cú pháp Lambda Expression
        // loại bỏ các phần tử lớn hơn 1
        list.removeIf(t -> t > 1);
        list.forEach(t -> System.out.println(t));
    }
}
