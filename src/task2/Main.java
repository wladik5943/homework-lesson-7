package task2;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Triangle triangle = new Triangle(5,7,10);
        Rectangle rectangle = new Rectangle(4,7);

        System.out.println(square.getPerimetr());
        System.out.println(square.getArea());

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimetr());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimetr());
    }
}
