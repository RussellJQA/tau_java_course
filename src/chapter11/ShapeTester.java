package chapter11;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(5, 7);
        rectangle1.print();
        System.out.println(rectangle1.calculateArea());
    }
}