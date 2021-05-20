package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person("Russell");
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
        square.print("square");

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}