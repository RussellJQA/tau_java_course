package exercises.chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static final String[] WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        System.out.println("Enter a number (1 to 7) for the day of the week (1 = 'Monday'): ");

        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();
        scanner.close();

        System.out.println("Day: " + getDay(dayNum));
    }

    public static String getDay(int dayNum) {
        return WEEK[dayNum - 1];
    }
}
