package concepts;

import java.util.Scanner;

public class Print_the_given_pattern {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        for(int i =1;i<num+1;i++){
            for(int j =1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //*******************method 2*********************** */
        // int num = in.nextInt();
        // for(int i =1;i<num+1;i++){
        //   System.out.print("* ".repeat(i));
        //   System.out.println();
        // }
    }

    //********************method 3***************** */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter the number of rows (N): ");
    //     int n = scanner.nextInt();
    //     scanner.close();
        
    //     // Loop to iterate over each row
    //     for (int i = 1; i <= n; i++) {
    //         // Loop to print stars for each row
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //             if (j < i) {
    //                 System.out.print(" "); // Print a space after each star, except for the last one
    //             }
    //         }
    //         System.out.println(); // Move to the next line after printing stars for each row
    //     }
    // }
}
