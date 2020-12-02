package B18_threading.Thuc_hanh.TestSynchonizedThread;

import java.util.Random;

public class Thread1 extends Thread {
    private ShareData shareData;
    public Thread1(ShareData shareData){
        this.shareData=shareData;
    }
    @Override
    public void run() {
        synchronized (shareData){
            try {
                shareData.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shareData.notifyAll();
        }
        Random random = new Random();
        for(int i =0;i<10;i++){
            int rad = random.nextInt(10);
            shareData.rad = rad;
            System.out.println("T1 > "+rad);
        }
    }
}
