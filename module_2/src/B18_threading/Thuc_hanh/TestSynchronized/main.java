package B18_threading.Thuc_hanh.TestSynchronized;

public class main {
    public static void main(String[] args) {
        ShareFile shareFile = new ShareFile();
        CustomerThread t1 = new CustomerThread(shareFile);
        CustomerThread t2 = new CustomerThread(shareFile);
        CustomerThread t3 = new CustomerThread(shareFile);
        CustomerThread t4 = new CustomerThread(shareFile);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
