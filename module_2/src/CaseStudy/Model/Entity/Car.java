package CaseStudy.Model.Entity;

public class Car extends Vehicle {

    private int seatAmount;
    private int hasSpareWheel;


    public Car(String color, String id, int weight, int cubic,int seatAmount,int hasSpareWheel) {
        super(color, id, weight, cubic);
        this.seatAmount = seatAmount;
        this.hasSpareWheel = hasSpareWheel;
    }
}
