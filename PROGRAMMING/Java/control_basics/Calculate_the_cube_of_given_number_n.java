package control_basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculate_the_cube_of_given_number_n {
    //  public static void main(String[] args) {
    //     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //     Scanner in = new Scanner(System.in);
    //     int num = in.nextInt();
    //     long pow = num;
    //     for(int i=1;i<3;i++){
    //       pow *= num;
    //     }
    //     System.out.print(pow);
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number

        // long cube = (long) Math.pow(n, 3); // Calculate the cube of n using Math.pow()

        BigInteger cube = BigInteger.valueOf(n).pow(3); // Calculate the cube of n using BigInteger

        System.out.println(cube); // Print the cube

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
