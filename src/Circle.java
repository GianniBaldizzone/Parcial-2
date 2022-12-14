public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
       return (getRadius()*getRadius()) * 3.14;
    }
    public double getPerimeter() {
        return getRadius()* 2 * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + " Shape {"
                +"color=" + getColor() +
                ", filled=" + isFilled() +
                "} "+
                "radius=" + radius +
                '}';
    }
}
