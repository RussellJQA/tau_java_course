package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

public class QuotaCalculator {

    public static void main(String[] args) {

        // Initialize known values
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on the path to take – Output
        if(sales >= quota)
            System.out.println("Congratulations! You're met your quota");
        else
            // TODO: If short by 1, print "sale", else print "sales"
            System.out.println("You did not make your quota. You were " + (quota - sales) + " sales short.");
    }
}
