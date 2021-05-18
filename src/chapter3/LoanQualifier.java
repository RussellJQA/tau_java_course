package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {

        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsAtCurrentJob = 2;

        // Get what we don't
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        // Make decision
        if(salary >= requiredSalary){
            if (years >= requiredYearsAtCurrentJob){
                System.out.println("Congratulations! You qualify for the loan.");
            }
            else
                System.out.println("Sorry. You must have worked at your current job "
                    + "for at least " + requiredYearsAtCurrentJob + " years to qualify for the loan.");
        }
        else
            System.out.println("Sorry. You need to be earn at least $" + requiredSalary + " to qualify for the loan.");

    }
}
