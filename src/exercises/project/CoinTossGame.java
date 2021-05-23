package exercises.project;

import java.util.Random;

/**
 * 3rd class - which:
 *      creates two players
 *      asks player 1 to choose heads or tails
 *      ensures that player 1’s guess is valid (Don't move on until player 1 actually has a valid guess.)
 *      automatically assigns player 2’s guess to the opposite of what player 1 chose
 *      flips the coin in this class to determine which side it landed on
 *      determines a winner based on what side the coin landed on
 * Be sure to use methods appropriately in this class.
 */
public class CoinTossGame {

    public static void main(String[] args) {

        Player player1 = new Player("Russell");
        Player player2 = new Player("Timothy");

        int guess;

        guess = getRandomGuess();
        System.out.print("Player 1 guessed ");
        Coin.printSide(guess);
        System.out.println();
        player1.setGuess(guess);

        guess = getOppositeSide(guess);
        System.out.print("Player 2 guessed ");
        Coin.printSide(guess);
        System.out.println();
        player2.setGuess(guess);

        Coin coin = new Coin();
        coin.setSide(coin.flip());

        if(coin.getSide() == player1.getGuess())
            System.out.println("Player 1 won!");
        else if(coin.getSide() == player2.getGuess())
            System.out.println("Player 2 won!");
   }

    public static int getRandomGuess() {
        Random r = new Random();
        return r.nextInt(2);
    }

    public static int getOppositeSide(int side) {
        if(side == Coin.HEADS)
            return Coin.TAILS;
        else
            return Coin.HEADS;
    }
}