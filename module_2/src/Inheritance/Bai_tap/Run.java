package Inheritance.Bai_tap;

public class Run {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0,"blue");
        Cylinder c3 = new Cylinder(3.0);
        Cylinder c4 = new Cylinder(33.0,"blue",33.0);
        System.out.println(c3.getRadius());
        System.out.println(c4.toString());
    }
}
