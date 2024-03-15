package control_basics;

import java.util.Scanner;

public class Print_1_to_n_in_reverse_order {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = num;i>0;i--){
          System.out.print("%d ".formatted(i));
        }
        in.close();
    }
}
