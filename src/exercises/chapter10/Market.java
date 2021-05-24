package exercises.chapter10;

public class Market {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setCalories(50);
        System.out.printf("\nA piece of fruit has %s calories%n", fruit.getCalories());
        fruit.makeJuice();

        Apple apple1 = new Apple();
        System.out.printf("\napple1 has %s  calories%n", apple1.getCalories());
        apple1.makeJuice();
        apple1.peel();
        apple1.removeSeeds();

        Fruit apple2 = new Apple();
        System.out.printf("\napple2 has %s calories", apple2.getCalories());
        apple2.makeJuice();
        ((Apple) apple2).peel();
        ((Apple) apple2).removeSeeds();

        Banana banana1 = new Banana();
        System.out.printf("\nbanana1 has %s calories", banana1.getCalories());
        banana1.makeJuice();
        banana1.peel();

        Lemon lemon1 = new Lemon();
        System.out.printf("\nlemon1 has %s calories%n", lemon1.getCalories());
        lemon1.makeJuice();
        lemon1.peel();
        lemon1.removeSeeds();

        Fruit lemon2 = new Lemon();
        System.out.printf("\nlemon2 has %s calories", lemon2.getCalories());
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