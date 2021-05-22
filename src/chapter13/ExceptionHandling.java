package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        createNewFile();

        try {
            createNewFileRethrow();
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }

        numbersExceptionHandling();

        calculateSalary(40, 25);
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/nonexistent.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("File not found or Input mismatch");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void calculateSalary(double hours, double rate) {
        if(hours > 40) {
            throw new IllegalArgumentException("We do not allow overtime.");
        }
        System.out.println(hours*rate);
    }
}