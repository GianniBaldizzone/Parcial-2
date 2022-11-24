public abstract class Shape {
    private String color;
    private boolean filled;


    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {
        this.color = "red";
        this.filled = true;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
