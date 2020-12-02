package B6_inheritance.Bai_tap;

public class Point_3D extends Point_2D {
    private float z;
    //constructor
    public Point_3D(){
        this.z=1.0f;
    }
    public Point_3D(float z){
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] f = new float[3];
        f[0]=this.getX();
        f[1]=this.getY();
        f[2]=this.getZ();
        return f;
    }
    @Override
    public String toString(){
        return "("+this.getX()+","+this.getY()+","+getZ()+")";
    }
}
