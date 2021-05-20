package exercises.chapter6;

import java.util.Scanner;

public class PhoneBill {

    // Global static variables
    static double taxRate = 15.0 * 0.01;  // 15%
    static double chargePerMinute = 0.25;
    static Scanner scanner = new Scanner(System.in);

    // Global member variables
    private String id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill() {
        promptForId();
        promptForBaseCost();
        promptForAllottedMinutes();
        promptForMinutesUsed();
    }

    public PhoneBill(String id) {
        this.id = id;
        promptForBaseCost();
        promptForAllottedMinutes();
        promptForMinutesUsed();
    }

    public PhoneBill(String id, double baseCost, double allottedMinutes, double minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void promptForId() {
        System.out.println("Enter an ID for the plan: ");
        id = scanner.next();
    }

    public void promptForBaseCost() {
        System.out.println("Enter base cost of the plan: ");
        baseCost = scanner.nextDouble();
    }

    public void promptForAllottedMinutes() {
        System.out.println("Enter the plan's allotted minutes: ");
        allottedMinutes = scanner.nextDouble();
    }

    public void promptForMinutesUsed() {
        System.out.println("Enter the plan minutes used this month: ");
        minutesUsed = scanner.nextDouble();
    }

    public double getOverage() {
        if(this.minutesUsed > this.allottedMinutes)
            return (minutesUsed - allottedMinutes) * chargePerMinute;
        else
            return 0;
    }

    public static double getTax(double subTotal) {
        return subTotal * taxRate;
    }

    public static double getTotal(double subTotal, double tax) {
        return subTotal + tax;
    }

    public void printItemizedBill()
    {
        System.out.println("Phone Bill Statement for: " + id);
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        double overage = getOverage();
        System.out.println("Overage: $" + String.format("%.2f", overage));
        double subTotal = baseCost + overage;
        double tax = getTax(subTotal);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        double total = getTotal(subTotal, tax);
        System.out.println("Total: $" + String.format("%.2f", total));
    }


}
