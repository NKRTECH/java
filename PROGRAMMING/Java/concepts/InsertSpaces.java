package concepts;

import java.util.Scanner;

public class InsertSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            sb.append(currentChar); // Append the current character
            // Check if the current character is lowercase and the next character is uppercase
            if (i < input.length() - 1 && Character.isLowerCase(currentChar) && Character.isUpperCase(input.charAt(i + 1))) {
                sb.append(" "); // Insert a space
            }
        }

        System.out.println("Modified string: " + sb.toString());
    }
}
