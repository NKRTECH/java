package concepts;

import java.util.Scanner;

public class EliminateSubstrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input string
        System.out.println("Enter the input string:");
        // Read the input string
        String input = scanner.nextLine();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Call the eliminateSubstrings method with the user's input
        String result = eliminateSubstrings(input);

        // Print the result
        System.out.println("Result: " + result);
    }

    public static String eliminateSubstrings(String str) {
        // Replace "b" and "ac" with an empty string
        str = str.replace("b", "").replace("ac", "");

        // Return the modified string
        return str;
    }
}