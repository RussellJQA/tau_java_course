package exercises.chapter10;

public class Banana extends Fruit {

    public Banana() {
        setCalories(105);
    }

    public void peel() {
        System.out.println("Peeling banana");
    }

    @Override
    protected void makeJuice() {
        System.out.println("Banana juice is made");
    }
}