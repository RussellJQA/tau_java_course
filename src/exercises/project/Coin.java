package exercises.project;

import java.util.Random;

/**
 * 1st class - It should contain:
 *      a field called side
 *      encapsulation
 *      constant variables for heads and tails
 *      a method called flip(), which randomly chooses heads or tails and assigns that value to side.
 */
public class Coin {

    // Static constants
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    // Member variables
    private String side;

    // Getters and Setters
    public String getSide() { return side; }
    public void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        String side = new Random().nextBoolean() ? HEADS : TAILS;
        setSide(side);

        return side;
    }
}