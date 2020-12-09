package Inheritance.Thuc_hanh;

public class Rectangle extends Shape {
    private double width;
    private  double height;
    // constructor
    public Rectangle(){
    }
    public Rectangle(double width,double height) {
        this.width= width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public  double getArea(){
         return this.height*this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    @Override
    public String toString(){
        return "Rectangle: "+this.width+" "+this.height;
    }
}

