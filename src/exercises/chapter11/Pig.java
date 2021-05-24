package exercises.chapter11;

public class Pig extends Animal {

    @Override
    public void makeSound() { System.out.println("\nOink"); }

    @Override
    public void eat() {
        super.eat();
        System.out.println("slop");
    }
}