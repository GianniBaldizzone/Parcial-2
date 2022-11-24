public class Square extends Rectangle{

    public Square(double side){
        this.setSide(side);
    }
    public Square(String color, boolean filled,double side,double width, double lenght) {
        super(color, filled,width,lenght );
        this.setSide(side);

    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLenght(side);
    }

@Override
    public void setWidth(double side) {
        this.width=side;
    }

    public void setLenght(double side) {
        this.lenght=side;
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
                "color='" + getColor() +
                ", filled=" + isFilled() +
                "}"+
                "side="+
                getSide()+
                "}";
    }
}
