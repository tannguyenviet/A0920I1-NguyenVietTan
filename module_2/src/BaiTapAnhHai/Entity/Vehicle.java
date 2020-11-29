package BaiTapAnhHai.Entity;

public abstract class Vehicle {
    private String name;
    private String color;
    private String id;
    private int weight;

    public Vehicle(String name,String color, String id, int weight) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.weight = weight;

    }

    public Vehicle() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
