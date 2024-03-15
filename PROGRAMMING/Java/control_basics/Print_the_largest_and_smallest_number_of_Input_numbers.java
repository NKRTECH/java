package control_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Print_the_largest_and_smallest_number_of_Input_numbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
          int num= in.nextInt();
          list.add(num);
        }
        // System.out.print(list);
        System.out.print("largest=%d%nsmallest=%d".formatted(Collections.max(list),Collections.min(list)));

        //**********same result while using \n */
        // System.out.print("largest=%d\nsmallest=%d".formatted(Collections.max(list), Collections.min(list)));
        in.close();
    }
}
