package exercises.project;

/**
 * 2nd class - Has the following:
 *      fields called name and guess
 *      encapsulation
 *      constructor which accepts a player's name
 */
public class Player {

    // Member variables
    private String id;
    private String name;
    private String guess;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getGuess() { return guess; }
    public void setGuess(String guess) { this.guess = guess; }

    // Constructor
    public Player(String id, String name) {
        setId(id);
        setName(name);
    }
}