package exercises.chapter10;

public class Market {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setCalories(50);
        System.out.println("\nA piece of fruit has " + String.format("%s", fruit.getCalories()) + " calories");
        fruit.makeJuice();

        Apple apple1 = new Apple();
        System.out.println("\napple1 has " + String.format("%s", apple1.getCalories()) + " calories");
        apple1.makeJuice();
        apple1.peel();
        apple1.removeSeeds();

        Fruit apple2 = new Apple();
        System.out.println("\napple2 has " + String.format("%s", apple2.getCalories()) + " calories");
        apple2.makeJuice();
        ((Apple) apple2).peel();
        ((Apple) apple2).removeSeeds();

        Banana banana1 = new Banana();
        System.out.println("\nbanana1 has " + String.format("%s", banana1.getCalories()) + " calories");
        banana1.makeJuice();
        banana1.peel();

        Lemon lemon1 = new Lemon();
        System.out.println("\nlemon1 has " + String.format("%s", lemon1.getCalories()) + " calories");
        lemon1.makeJuice();
        lemon1.peel();
        lemon1.removeSeeds();

        Fruit lemon2 = new Lemon();
        System.out.println("\nlemon2 has " + String.format("%s", lemon2.getCalories()) + " calories");
        lemon2.makeJuice();
        ((Lemon) lemon2).peel();
        ((Lemon) lemon2).removeSeeds();

        System.out.println();
        squeeze(apple1);
        squeeze(apple2);
        squeeze(banana1);
        squeeze(lemon1);
        squeeze(lemon2);
    }

    public static void squeeze(Fruit fruit) {
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}