package control_basics;

import java.util.Scanner;

public class Print_the_asterisk_in_n_lines {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
          for(int j=0;j<num;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }

  //   public static void main(String[] args) {
  //     Scanner scanner = new Scanner(System.in);
  //     int n = scanner.nextInt(); // Read the input number
  //     scanner.close(); // Close the scanner to avoid resource leaks

  //     // Use a loop to print n lines of n asterisks
  //     for (int i = 0; i < n; i++) {
  //         System.out.println("*".repeat(n));
  //     }
  // }
}
