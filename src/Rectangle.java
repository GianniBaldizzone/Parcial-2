public class Rectangle extends Shape {
    public double width;
    public double lenght;

    public Rectangle() {
        this.width = 1;
        this.lenght = 1;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return getWidth()*getLenght();
    }

    public double getPerimeter() {
        return 2*getWidth()+2*getLenght();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Shape{"
                + "color='" + getColor() +
                ", filled=" + isFilled() +
                "}" +
                "width=" + getWidth() + '/' +
                "length=" + getLenght() +
                '}';
    }
}
