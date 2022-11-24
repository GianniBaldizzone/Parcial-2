public class Square extends Rectangle{

    public Square(String color, boolean filled, double width, double lenght,double side) {
        super(color, filled,width,lenght);
        this.setSide(side);

    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLenght(side);
    }


    public void setWidth(double side) {
        this.setWidth(side);
    }

    public void setLenght(double side) {
        this.setLenght(side);
    }
    public double getArea() {
        return getSide()*getSide();
    }
    public double getPerimeter() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Shape´{"+
                "color='" + getColor() + '/' +
                ", filled=" + isFilled() +
                "}"+
                getSide()+
                "}";
    }
}
