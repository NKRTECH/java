package control_basics;

import java.util.Scanner;

public class Print_the_odd_number_series_upto_N_terms {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("%d ".formatted(2*i-1));
        }
    }
}
