package CaseStudy.Model.Entity;

public abstract class Vehicle {
    private String color;
    private String id;
    private int weight;
    private int cubic;// Phân khối

    public Vehicle(String color, String id, int weight, int cubic) {
        this.color = color;
        this.id = id;
        this.weight = weight;
        this.cubic = cubic;
    }

    public Vehicle() {

    }
}
