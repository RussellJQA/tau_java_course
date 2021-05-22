package exercises.chapter11;

import exercises.chapter11.Animal;

public class Duck extends Animal {

    @Override
    public void makeSound() {
        System.out.println("\nQuack");
    }

    @Override
    public void eat() {
        System.out.println("Eating worms and seeds");
    }
}