package control_basics;

import java.util.Scanner;

public class Print_all_vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // Read the input string
        scanner.close(); // Close the scanner to avoid resource leaks

        // Define the vowels
        String vowels = "aeiou";

        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            // Check if the current character is a vowel
            if (vowels.indexOf(c) != -1) {
                // If it is a vowel, print it
                System.out.print(c);
            }
        }
    }
    
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String word = scanner.nextLine(); // Read the input string
    //     scanner.close(); // Close the scanner to avoid resource leaks

    //     // Define the vowels
    //     String vowels = "aeiou";

    //     // Use StringBuilder to build the output string of vowels
    //     StringBuilder vowelString = new StringBuilder();

    //     // Iterate through each character in the word
    //     for (char c : word.toCharArray()) {
    //         // Check if the current character is a vowel
    //         if (vowels.indexOf(c) != -1) {
    //             // If it is a vowel, append it to the StringBuilder
    //             vowelString.append(c);
    //         }
    //     }

    //     // Print the vowel string
    //     System.out.println(vowelString.toString());
    // }
}
