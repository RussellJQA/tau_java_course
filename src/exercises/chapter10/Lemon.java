package exercises.chapter10;

public class Lemon extends Fruit {

    public Lemon() {
        setCalories(17);
    }

    public void peel() {
        System.out.println("Peeling lemon");
    }

    public void removeSeeds() {
        System.out.println("Removing lemon seeds");
    }

    @Override
    protected void makeJuice() {
        System.out.println("Lemon juice is made");
    }
}