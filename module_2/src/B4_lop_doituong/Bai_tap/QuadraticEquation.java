package B4_lop_doituong.Bai_tap;

public class QuadraticEquation {

  private double a;
  private double b;
  private double c;
  private double delta;
    public QuadraticEquation(double a, double b,double c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public void findDelta(){
         setDelta(Math.pow(this.b,2)-4*this.a*this.c);
    }
    public double root1(){
        if (getDelta()<0){
            return 0;
        }
        else
        return (-this.b + Math.sqrt(this.getDelta()))/2*this.a;
    }
    public  double root2(){
        if (this.getDelta()<0){
            return 0;
        }
        else
        return (-this.b - Math.sqrt(this.getDelta()))/2*this.a;
    }

}
