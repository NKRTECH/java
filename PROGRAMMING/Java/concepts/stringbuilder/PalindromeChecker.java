package concepts.stringbuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalindromeChecker {
    //********************method 1 using stringbuilder */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a string:");
    //     String input = scanner.nextLine();
    //     scanner.close();

    //     // Reverse the input string using StringBuilder
    //     String reversed = new StringBuilder(input).reverse().toString();

    //     // Check if the reversed string is equal to the original string
    //     if (input.equals(reversed)) {
    //         System.out.println("Palindrome");
    //     } else {
    //         System.out.println("Not Palindrome");
    //     }
    // }

    //*************method 2 using list but not recommended******/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        // Convert the string to a list of characters
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        // Create a copy of the original list
        List<Character> originalList = new ArrayList<>(charList);

        // Reverse the list
        Collections.reverse(charList);

        // Check if the reversed list is equal to the original list
        boolean isPalindrome = charList.equals(originalList);

        // Print the result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
