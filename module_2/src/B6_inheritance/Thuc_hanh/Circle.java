package B6_inheritance.Thuc_hanh;

public class Circle extends Shape {
    private double radius;
    public Circle (){
        this.radius=1.0;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle: "+this.getColor()+" "+this.getRadius();
    }

}
