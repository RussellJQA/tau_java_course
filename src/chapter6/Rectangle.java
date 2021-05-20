package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    double calculateArea() {
        return length * width;
    }
}


