package chapter10;

public class Car extends Vehicle{

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.drive();

        System.out.println(car instanceof Car);
    }

    @Override
    public void drive() {
        System.out.println("drive() from class Car");
    }
}
