package chapter4;
import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static void main(String args[]){

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;
        int minHours = 1;

        // Get input for unknown variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week?");
        double hours = scanner.nextDouble();

        // Validate input
        while((hours < minHours) || (hours > maxHours)){
            System.out.println("Invalid entry. Your hours must be between " + minHours + " and " + maxHours + ". Try again.");
            hours = scanner.nextDouble();
        }

        scanner.close();

        // Calculate gross
        double gross = rate * hours;
        System.out.println("Gross pay: $" + String.format("%.2f", gross));
    }
}
