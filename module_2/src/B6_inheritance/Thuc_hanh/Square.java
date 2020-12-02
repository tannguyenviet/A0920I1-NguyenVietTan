package B6_inheritance.Thuc_hanh;

public class Square extends Rectangle {
    private float a =2;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public Square() {
    this.setHeight(1.0);
    }
    public Square (int side){
        this.setWidth(side);
        this.setHeight(side);
    }
    @Override
    public String toString(){
        return "Square: "+this.getColor()+" "+this.getA();
    }

}
