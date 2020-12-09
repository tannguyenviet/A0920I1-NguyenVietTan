package B7_abtract_class_interfacee.Bai_tap.InterfaceResizeable;

public class Square implements Resizeable {
    private double a =2;
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void reSize(double percent) {
        this.setA(this.getA()*percent);
    }
//    public Square() {
//        this.setHeight(1.0);
//    }
//    public Square (int side){
//        this.setWidth(side);
//        this.setHeight(side);
//    }
}
