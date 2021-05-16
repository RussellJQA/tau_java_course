package exercises.chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies would you like?");
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        scanner.close();

        int cents = 25 * quarters + 10 * dimes + 5 * nickels + pennies;
        if(cents == 100)
            System.out.println("Congratulations! The value of those coins is exactly 1 dollar. You win!");
        else{
            double dollars = cents / 100.0;
            if(cents < 100)
                System.out.println("Sorry! You lose! The value of those coins is only $" + String.format("%.2f", dollars) + " which is less than 1 dollar.");
            else
                System.out.println("Sorry! You lose! The value of those coins is $" + String.format("%.2f", dollars) + " which is more than 1 dollar.");

        }
    }
}
