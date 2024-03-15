package control_advanced;

import java.util.Scanner;

public class InsertSpaces {
    //**********************method 1 using StringBuilder but easy logic********/
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the string:");
    //     String str = in.nextLine();
    //     StringBuilder result = new StringBuilder();

    //     // Loop through each character of the input string
    //     for (int i = 0; i < str.length(); i++) {
    //         char curr = str.charAt(i);
    //         // Append the current character to the result StringBuilder
    //         result.append(curr);
    //         // If the current character is lowercase and the next character is uppercase,
    //         // append a space to the result StringBuilder
    //         if (Character.isLowerCase(curr) && i + 1 < str.length() && Character.isUpperCase(str.charAt(i + 1))) {
    //             result.append(" ");
    //         }
    //     }

    //     // Print the final result
    //     System.out.println("Output: " + result.toString());
    // }

    //**********************method 2 using StringBuilder with difficult logic********/
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     String str = in.nextLine();
    //     StringBuilder ltr = new StringBuilder(str);
        
    //     // Loop through the characters of the string
    //     for (int i = 0; i < ltr.length() - 1; i++) {
    //         // Check if the current character is lowercase and the next character is uppercase
    //         if (Character.isLowerCase(ltr.charAt(i)) && Character.isUpperCase(ltr.charAt(i + 1))) {
    //             // If the condition is true, insert a space after the lowercase character
    //             // Explanation: We need to insert a space between the lowercase and uppercase characters
    //             // To do this, we insert the space at the position immediately after the lowercase character
    //             // The position is determined by i + 1, where i is the index of the lowercase character
    //             // This ensures that we don't interfere with the current character being checked
    //             ltr.insert(i + 1, " ");
    //         }
    //     }
        
    //     // Print the modified string
    //     System.out.print(ltr);
    // }

    //********************method 3 using beginner friendly approach********/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        // Initialize an empty string to store the modified string
        String result = "";
        
        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result += currentChar; // Append the current character to the result string
            
            // Check if the current character is lowercase and the next character is uppercase
            if (Character.isLowerCase(currentChar) && i < input.length() - 1 && Character.isUpperCase(input.charAt(i + 1))) {
                result += ' '; // Insert a space after the lowercase character
            }
        }
        
        // Output the modified string
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
