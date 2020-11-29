package BaiTapAnhHai.Entity;

public class Car extends Vehicle {

    private int seatAmount;
    private int hasSpareWheel;


    public Car(String name,String color, String id, int weight, int cubic,int seatAmount,int hasSpareWheel) {
        super(name,color, id, weight);
        this.seatAmount = seatAmount;
        this.hasSpareWheel = hasSpareWheel;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount) {
        this.seatAmount = seatAmount;
    }

    public int getHasSpareWheel() {
        return hasSpareWheel;
    }

    public void setHasSpareWheel(int hasSpareWheel) {
        this.hasSpareWheel = hasSpareWheel;
    }
}