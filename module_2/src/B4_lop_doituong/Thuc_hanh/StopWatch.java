package B4_lop_doituong.Thuc_hanh;

public class StopWatch {
    private int startTime;
    private int endTime;

    //constructor
    public StopWatch(int start, int end){
        this.startTime=start;
        this.endTime = end;
    }
    //get set
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }



}
