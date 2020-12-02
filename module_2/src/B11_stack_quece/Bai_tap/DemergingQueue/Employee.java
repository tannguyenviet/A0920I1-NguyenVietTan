package B11_stack_quece.Bai_tap.DemergingQueue;

public class Employee {
    private String name;
    private boolean gender;
    private int mssv;

    public Employee(String name,Boolean gender,int mssv){
        this.name=name;
        this.gender=gender;
        this.mssv=mssv;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
}
