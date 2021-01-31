package test;

import Inheritance.Bai_tap.Point_2D;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Birth bird = new Birth();
        bird.IsFly();
        bird.SayHello();
        A  s = new A();
        iMarkerCanFly  m = new iMarkerCanFly();
        markerInterface m1 = new iMarkerCanFly();
        markerInterface m2 = new iMarkerCanNotFly();

        methodA(m1);
        methodA(m2);
        Class<?> clazz =  markerInterface.class;

    }
    public static void methodA(markerInterface t){
        t.saySomeThing();
    }

}
interface  markerInterface{
void saySomeThing();
}
class A {

}
class iMarkerCanFly implements  markerInterface{
    int a=0;
    @Override
    public void saySomeThing() {
        System.out.println("ssss"+a);

    }
}

class iMarkerCanNotFly implements  markerInterface{
    int a=1;
    @Override
    public void saySomeThing() {
        System.out.println("ssss"+a);

    }
}