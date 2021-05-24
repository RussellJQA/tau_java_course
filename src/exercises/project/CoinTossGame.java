package exercises.project;

import java.util.Scanner;

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

    // Member variables
    private Scanner scanner;

    public static void main(String[] args) {

        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player("player 1", game.getPlayerName("player 1"));
        Player player2 = new Player("player 2", game.getPlayerName("player 2"));

        player1.setGuess(game.getGuess());
        player2.setGuess(player1.getGuess().equals(Coin.HEADS) ? Coin.TAILS : Coin.HEADS);
        System.out.printf("Guess for player 2 set to '%s'%n", player2.getGuess());

        Coin coin = new Coin();
        coin.setSide(coin.flip());

        // Report winner
        String side = coin.getSide();
        Player winner = side.equals(player1.getGuess()) ? player1 : player2;
        reportWinner(side, winner);
    }

    private String getPlayerName(String whichPlayer) {
        System.out.printf("Enter name for %s: ", whichPlayer);
        return scanner.next();
    }

    private String getGuess() {

        String guess;

        do {
            System.out.printf("Enter a guess ('%s' or '%s') for player 1: ", Coin.HEADS, Coin.TAILS);
            guess = scanner.next();
        } while(!guess.equals(Coin.HEADS) && !guess.equals(Coin.TAILS));

        return guess;
    }

    private static void reportWinner(String side, Player winner) {
        System.out.printf("Coin toss landed '%s' up so %s (%s) won!%n", side, winner.getId(), winner.getName());
    }
}