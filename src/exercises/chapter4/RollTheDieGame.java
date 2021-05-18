package exercises.chapter4;

import java.util.Scanner;
import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int max_rolls = 5;
        int board_size = 20;
        int board_loc = 0;

        for (int i = 0; i < max_rolls; i++) {
            int die = r.nextInt(6) + 1;
            if(board_loc + die > board_size) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ", but there are only " + (board_size-board_loc) + " more spaces to go.");
                break;
            }
            board_loc += die;
            if(board_loc == board_size)
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You're on space " + board_loc + ". Congrats, you win!");
            else
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + board_loc + " and have " + (board_size-board_loc) + " more to go.");
        }
        if(board_loc != board_size)
            System.out.println("Game over! You lose!");

        scanner.close();
    }
}
