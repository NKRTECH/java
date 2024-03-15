package control_advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDigitsInAString {

    //******************method 1 using beginner friendly for loop and charAt()**************************
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of numerical values:");
        String input = scanner.nextLine();
        scanner.close();

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Iterate through the string and count occurrences
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '0') {
                count0++;
            } else if (currentChar == '1') {
                count1++;
            } else if (currentChar == '2') {
                count2++;
            }
        }

        // Print the counts of 0, 1, and 2
        System.out.println(count0 + " " + count1 + " " + count2);
    }

    //******************method 2 using hashmap***************************/

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
        
    //     // Input the string
    //     System.out.println("Enter the string:");
    //     String input = scanner.nextLine();
        
    //     // Create a map to store digit counts
    //     Map<Character, Integer> digitCounts = new HashMap<>();
        
    //     // Initialize counts for 0, 1, and 2
    //     digitCounts.put('0', 0);
    //     digitCounts.put('1', 0);
    //     digitCounts.put('2', 0);
        
    //     // Count the occurrences of 0, 1, and 2 in the string
    //     for (char ch : input.toCharArray()) {
    //         if (digitCounts.containsKey(ch)) {
    //             digitCounts.put(ch, digitCounts.get(ch) + 1);
    //         }
    //     }
        
    //     // Output the counts
    //     for (char ch : digitCounts.keySet()) {
    //         System.out.print(digitCounts.get(ch) + " ");
    //     }
    //     System.out.println(digitCounts);
    //     // Get the Set of keys (digits) from digitCounts
    //     Set<Character> keySet = digitCounts.keySet();
    //     System.out.println("Set of keys (digits) in digitCounts: "+keySet);
    //     // Print the Set of keys
    //     // System.out.println("Set of keys (digits) in digitCounts:");
    //     // for (char ch : keySet) {
    //     //     System.out.print(ch + " ");
    //     // }
    //     scanner.close();
    // }

    //******************method 3 using collections.frequency()**************************/

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter a string of numerical values:");
    //     String input = scanner.nextLine();
    //     scanner.close();

    //     // Convert the string to a List of characters
    //     List<Character> characters = new ArrayList<>();
    //     for (char c : input.toCharArray()) {
    //         characters.add(c);
    //     }

    //     // Count the occurrences of 0, 1, and 2 using Collections.frequency
    //     int count0 = Collections.frequency(characters, '0');
    //     int count1 = Collections.frequency(characters, '1');
    //     int count2 = Collections.frequency(characters, '2');

    //     // Print the counts
    //     System.out.println(count0 + " " + count1 + " " + count2);
    // }
}