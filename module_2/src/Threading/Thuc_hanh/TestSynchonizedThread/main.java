package Threading.Thuc_hanh.TestSynchonizedThread;

public class main {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        Thread1 t1 = new Thread1(shareData);
        Thread2 t2 = new Thread2(shareData);
        t1.start();
        t2.start();
    }
}
