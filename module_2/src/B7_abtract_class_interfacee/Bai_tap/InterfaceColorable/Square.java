package B7_abtract_class_interfacee.Bai_tap.InterfaceColorable;

public class Square implements Colorable {

    private double a ;
    private boolean colorAble;
    public Square(int a,boolean colorAble){
        this.colorAble=colorAble;
        this.a = a;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void printAcreage(){
        System.out.println(" Diện tích là "+this.a*this.a);
    }
    @Override
    public void howToColor() {
        if(colorAble){
            System.out.println("  Color all four sides..");
        }
    }
}
