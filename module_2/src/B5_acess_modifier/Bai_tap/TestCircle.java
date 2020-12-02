package B5_acess_modifier.Bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        System.out.println("Area 1 : " +c1.getArea()+" with radius " +c1.getRadius());
        System.out.println("Area 2 :" + c2.getArea()+" with radius " +c2.getRadius());


    }
}
