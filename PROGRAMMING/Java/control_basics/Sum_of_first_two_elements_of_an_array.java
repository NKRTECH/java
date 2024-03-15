package control_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_of_first_two_elements_of_an_array {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        List<Integer> arr= new ArrayList<>();
        int num = in.nextInt();
        for(int i=0;i<num;i++){
          int inp = in.nextInt();
          arr.add(inp);
        }
        in.close();
        System.out.print(arr.get(0)+arr.get(1));
    }
}
