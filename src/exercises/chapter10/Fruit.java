package exercises.chapter10;

public class Fruit {

    protected int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    protected void makeJuice() {
        System.out.println("Juice is made");
    }
}