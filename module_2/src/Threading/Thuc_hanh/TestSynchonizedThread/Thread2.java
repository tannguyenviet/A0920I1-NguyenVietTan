package Threading.Thuc_hanh.TestSynchonizedThread;

public class Thread2 extends Thread {
    private ShareData shareData;
    public Thread2(ShareData shareData){
        this.shareData=shareData;
    }
    @Override
    public void run(){
        synchronized (shareData){
            shareData.notifyAll();
            try {
                shareData.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        for(int i =0;i<10;i++){
            int value = shareData.rad*shareData.rad;
            System.out.println("T2 >"+value);
        }


    }
}
