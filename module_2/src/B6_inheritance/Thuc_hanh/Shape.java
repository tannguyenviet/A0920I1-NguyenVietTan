package B6_inheritance.Thuc_hanh;

public class Shape  {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // constructor
    public  Shape(){
        this.color="Green";
        this.filled= true;

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String toString(){
        return( " A Shape with color of xxx and filled/not filled");
    }


}
