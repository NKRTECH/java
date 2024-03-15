package control_advanced;

import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input string
        int startPosition = scanner.nextInt(); // Read the starting position
        int length = scanner.nextInt(); // Read the length of the substring

        // Extract the substring
        String substring = input.substring(startPosition, startPosition + length);

        System.out.println(substring); // Print the extracted substring
    }
}
