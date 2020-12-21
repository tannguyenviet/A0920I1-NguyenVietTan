package test;

import java.util.ArrayList;
import java.util.List;

public class TestException {
    public  int  DivideZero() throws Exception{

            return 10/0;


    }

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.remove(0) ;
        list.add(0,"A1");
        list.add(2,"AB");
        for(String st :list){
            System.out.println(st);
        }

    }
}
