package control_basics;

import java.util.Scanner;

/**
 * Print_the_difference_between_a_and_b
 */
public class Print_the_difference_between_a_and_b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt(); // Read the first number
        int num2 = in.nextInt(); // Read the second number
        in.close(); // Close the scanner to avoid resource leaks

        // Calculate the absolute difference between the two numbers
        int difference = Math.abs(num1 - num2);

        // Print the absolute difference
        System.out.println(difference);
    }
}