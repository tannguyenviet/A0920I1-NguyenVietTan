package B18_threading.Thuc_hanh.TestSynchronized;

import java.util.Random;

public class CustomerThread extends Thread {
    ShareFile sharefile;
    public CustomerThread(ShareFile shareFile){
        this.sharefile=shareFile;
    }
    @Override
    public void run() {
        Random random = new Random();
        for(int i=0;i<5;i++){
            int rad = random.nextInt(5)+1;
            sharefile.add(rad);
        }
    }
}
