package B7_abtract_class_interfacee.Bai_tap.InterfaceResizeable;

public class Rectangle implements Resizeable {
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
    public void reSize(double percent) {
        this.setHeight(this.getHeight()*percent);
        this.setWidth(this.getWidth()*percent);
    }
}
