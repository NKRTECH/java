package control_advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountHashes {
    //**********************method 1 using split()**************** */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.nextLine(); // Read the input string

    //     // Split the string by the hash character
    //     String[] parts = input.split("#");

    //     // The number of hashes is the number of parts minus one
    //     int numberOfHashes = parts.length - 1;

    //     System.out.println(numberOfHashes); // Print the number of hashes
    // }

    //***********************method 2 using for loop**************** */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.nextLine(); // Read the input string

    //     int numberOfHashes = 0;
    //     for (int i = 0; i < input.length(); i++) {
    //         if (input.charAt(i) == '#') {
    //             numberOfHashes++;
    //         }
    //     }

    //     System.out.println(numberOfHashes); // Print the number of hashes
    // }

    //***********************method 3 using Collections.frequency**************** */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input string

        // Convert the string to a list of characters
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        // Count the number of hashes using Collections.frequency
        int numberOfHashes = Collections.frequency(charList, '#');

        System.out.println(numberOfHashes); // Print the number of hashes
    }
}
