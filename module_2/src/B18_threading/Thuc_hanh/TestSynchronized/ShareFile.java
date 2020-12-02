package B18_threading.Thuc_hanh.TestSynchronized;

public class ShareFile {
    int x=0;
    public synchronized void add(int value){
        x+=value;
        System.out.println("\n Dãy số x: "+x);
        for (int i=0;i<x;i++){
            System.out.print(" "+i);
        }
    };
}
