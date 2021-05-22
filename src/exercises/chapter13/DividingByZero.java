package exercises.chapter13;

public class DividingByZero {

    public static void main(String[] args) {
        divideByZero();
    }

    public static void divideByZero() {
        try {
            int c = 30/0;
            System.out.println(c);
        } catch (ArithmeticException e) {  // Catches divide by zero
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.println("Division is fun");
        }
    }
}