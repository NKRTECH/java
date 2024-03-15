package control_basics;

import java.util.Scanner;

public class Calculate_the_cube_of_all_number_from_1ton {

    //*****************method 1**************** */

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         System.out.print((long)Math.pow(i, 3) + " ");
    //     }
    //     sc.close();
    // }

    //*****************method 2**************** */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long cube;
        for(int i=1;i<=num;i++){
          cube =(long) Math.pow(i,3);
          System.out.print("%d ".formatted(cube));
        }
        in.close(); 
    }
}
