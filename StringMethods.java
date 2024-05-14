import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        System.out.println("Length of the string: " + userInput.length());
        
        System.out.println("Uppercase: " + userInput.toUpperCase());
        
        System.out.println("Lowercase: " + userInput.toLowerCase());
        
        System.out.println("First character: " + userInput.charAt(0));
        
        System.out.println("Last character: " + userInput.charAt(userInput.length() - 1));
        
        if (userInput.length() >= 5) {
            System.out.println("Substring (2nd to 5th char): " + userInput.substring(1, 5));
        } else {
            System.out.println("The string is not long enough for a substring from 2nd to 5th character.");
        }
        
        scanner.close();
    }
}