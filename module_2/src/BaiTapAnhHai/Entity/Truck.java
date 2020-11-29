package BaiTapAnhHai.Entity;


public class Truck extends Vehicle {
    private String stock;
    private int limitWeight;


    public Truck(String name, String color, String id, int weight, String stock, int limitWeight) {
        super(name,color, id, weight);
        this.stock= stock;
        this.limitWeight=limitWeight;
    }

    public Truck() {
        super();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getLimitWeight() {
        return limitWeight;
    }

    public void setLimitWeight(int limitWeight) {
        this.limitWeight = limitWeight;
    }
}
