package exercises.chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private final String username;
    private final String password;

    public PasswordValidator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new password: ");
        String proposedPassword = scanner.next();
        scanner.close();

        PasswordValidator validator = new PasswordValidator("Russell", "Passw@rd");
        if(validator.validatePassword(proposedPassword))
            System.out.println("The new password is valid!");
    }

    boolean validatePassword(String proposedPassword) {

        if( proposedPassword.length() < 8) {
            System.out.println("The new password must be at least 8 characters long.");
            return false;
        }

        if(!containsUpperCase(proposedPassword)) {
            System.out.println("The password must contain an uppercase character.");
            return false;
        }

        if(!containsSpecialCharacter(proposedPassword)) {
            System.out.println("The new password must contain a special character.");
            return false;
        }

        if(proposedPassword.equals(password)) {
            System.out.println("The new password must not be the same as the old password.");
            return false;
        }

        if(proposedPassword.contains(username)) {
            System.out.println("The new password must not contain the username.");
            return false;
        }

        // If the proposed password got this far without being found invalid, then it's valid
        return true;
    }

    static boolean containsUpperCase(String word) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) {
                found = true;
                break;
            }
        }
        return found;
    }

    static boolean containsSpecialCharacter(String word) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)) {
                found = true;
                break;
            }
        }
        return found;
    }
}