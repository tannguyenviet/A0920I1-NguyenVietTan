package Inheritance.Bai_tap;

public class Cylinder extends Circle {
    private double depth;
    public Cylinder(){
        this.depth=1.0;
    }
    public  Cylinder( double depth){
        this.depth = depth;
    }
    public Cylinder(double rad,String c ,double d){
//        this.setColor(c);
//        this.setRadius(rad);
        super.setColor(c);
        super.setRadius(rad);
        this.setDepth(d);

    }
    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String toString(){
        return "Day la Cylinder "+"rad: "+ this.getRadius()+" color: "+this.getColor()+" depth: "+this.getDepth();
    }
}
