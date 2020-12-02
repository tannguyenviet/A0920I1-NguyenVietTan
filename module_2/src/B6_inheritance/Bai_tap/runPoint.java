package B6_inheritance.Bai_tap;

public class runPoint {
    public static  void ExportArr(float[] f){
        for(int i =0;i<f.length;i++){
            System.out.println("A["+i+"]: " + f[i]);
        }
    }
    public static void main(String[] args) {
        Point_2D p1 = new Point_2D(3.0f,5.0f);
        float[]  f ;
        f=p1.getXY();
        ExportArr(f);
        System.out.println(p1.toString());
        Point_3D p2 = new Point_3D(3.0f);
        f=p2.getXYZ();
        ExportArr(f);
        System.out.println(p2.toString());

    }
}
