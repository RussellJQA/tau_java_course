package exercises.chapter10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(95);
    }

    public void peel() {
        System.out.println("Peeling apple");
    }

    public void removeSeeds() {
        System.out.println("Removing apple seeds");
    }

    @Override
    protected void makeJuice() {
        System.out.println("Apple juice is made");
    }
}