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

    public static final int HEADS = 0;
    public static final int TAILS = 1;

    public int side;

    public int flip() {
        Random r = new Random();
        setSide(r.nextInt(2));

        System.out.print("Coin flipped to side: ");
        printSide(getSide());
        System.out.println();

        return side;
    }

    public int getSide() { return side; }

    public void setSide(int side) {
        this.side = side;
    }

    public static void printSide(int side) {
        if( side == HEADS)
            System.out.print("heads");
        else
            System.out.print("tails");

    }
}