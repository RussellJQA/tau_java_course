package exercises.chapter4;

import java.util.Scanner;
import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int maxRolls = 5;
        int boardSize = 20;
        int boardLoc = 0;

        String moreToGoMsg;

        for (int i = 0; i < maxRolls; i++) {
            int die = r.nextInt(6) + 1;
            String rolledMsg = "Roll #" + (i+1) + ": You've rolled a " + die + ".";
            if(boardLoc + die > boardSize) {
                int moreToGo = boardSize-boardLoc;
                if(moreToGo == 1)
                    moreToGoMsg = "is only 1 more space";
                else
                    moreToGoMsg = "are only " + moreToGo + " more spaces";
                System.out.println(rolledMsg + " But you were already on space " + boardLoc + ", and there " + moreToGoMsg + " beyond that.");
                break;
            }
            boardLoc += die;
            if(boardLoc == boardSize) {
                System.out.println(rolledMsg + " You are now on space " + boardLoc + ". Congrats, you win!");
                break;
            } else
                System.out.println(rolledMsg + " You are now on space " + boardLoc + " and have " + (boardSize-boardLoc) + " more to go.");
        }

        if(boardLoc != boardSize)
            System.out.println("You lose!");

        scanner.close();
    }
}
