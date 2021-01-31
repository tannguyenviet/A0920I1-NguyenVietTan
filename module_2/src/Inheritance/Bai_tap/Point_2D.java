package Inheritance.Bai_tap;

public class Point_2D {
    private float x;
    private float y;
    public Point_2D(){
        this.x=3.0f;
        this.y=4.0f;
    }
    public Point_2D(float x, float y){
        this.x =x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float f[]= new float[2];
        f[0]=this.getX();
        f[1]=this.getY();
        return f;
    }
    @Override
    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
}
