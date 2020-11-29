package CaseStudy.Model.Entity;

public class Trucke extends Vehicle {
    private int stock;
    private int limitWeight;


    public Trucke(String color, String id, int weight, int cubic, int stock, int limitWeight) {
        super(color, id, weight, cubic);
        this.stock= stock;
        this.limitWeight=limitWeight;
    }
}
