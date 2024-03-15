package control_advanced;

import java.util.Scanner;

public class Print_the_index_for_the_given_element_K {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine(); // Consume the newline character
        String[] strarr = in.nextLine().split(" ");
        String target = in.nextLine();

        // Initialize a variable to store the index of the target element
        int index = -1;

        // Iterate through the array to find the target element
        for (int i = 0; i < size; i++) {
            // Use .equals() for string comparison
            if (strarr[i].equals(target)) {
                index = i; // If the target element is found, store its index
                break; // Exit the loop as we've found the target
            }
        }

        // Print the index of the target element or -1 if it doesn't exist
        System.out.println(index);
    }
}
