public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        Shape s1 = new Circle("red", false, 5.5);
        Circle s2 = new Circle();
        Shape s3 = new Rectangle("red", false, 1, 2);
        Shape s4 = new Square(6.6);

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);

        s2.setColor("red");
        s2.setFilled(false);
        s2.setRadius(5.5);
        System.out.println("");
        System.out.println("Circulo creado con getters y setters");
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        System.out.println(s2.getRadius());
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
    }
}
