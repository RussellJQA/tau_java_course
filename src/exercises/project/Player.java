package exercises.project;

/**
 * 2nd class - Has the following:
 *      fields called name and guess
 *      encapsulation
 *      constructor which accepts a player's name
 */
public class Player {

    public String name;
    public int guess;

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
}