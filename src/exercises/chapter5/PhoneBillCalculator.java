package exercises.chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    // Global variables
    static double taxRate = 15.0 * 0.01;  // 15%
    static double chargePerMinute = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get what we don't know
        double planFee = getPlanFee();
        double overage = getOverage();
        scanner.close();

        // Do calculations
        double subTotal = planFee + overage;
        double tax = getTax(subTotal);
        double total = getTTotal(subTotal, tax);

        printItemizedBill(planFee, overage, tax, total);
    }

    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }

    public static double getOverage() {
        System.out.println("Enter overage minutes: ");
        return scanner.nextDouble() * chargePerMinute;
    }

    public static double getTax(double subTotal) {
        return subTotal * taxRate;
    }

    public static double getTTotal(double subTotal, double tax) {
        return subTotal + tax;
    }

    public static void printItemizedBill(double planFee, double overage, double tax, double total)
    {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
