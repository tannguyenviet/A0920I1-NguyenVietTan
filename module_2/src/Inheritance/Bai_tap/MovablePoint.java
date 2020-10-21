package Inheritance.Bai_tap;

public class MovablePoint extends Point_2D {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
        this.xSpeed = 1.0f;
        this.ySpeed = 1.0f;
    }
    public MovablePoint(float sp1,float sp2){
        this.xSpeed =sp1;
        this.ySpeed = sp2;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
 
    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void getSpeed(){
        float [] f = new float[2];
        f[0]=this.getxSpeed();
        f[1]= this.getySpeed();
    }
    public MovablePoint move(){
        this.setxSpeed(this.getX()+this.xSpeed);
        this.setySpeed(this.getY()+this.ySpeed);
        return this;
    }
    @Override
    public String toString(){
        return "("+this.getX()+","+this.getY()+"),speed=("+this.getxSpeed()+","+this.getySpeed()+")";
    }
}
