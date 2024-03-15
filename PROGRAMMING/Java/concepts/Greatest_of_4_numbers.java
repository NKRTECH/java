package concepts;
import java.io.*;
import java.util.*;

public class Greatest_of_4_numbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        List<Integer> arrnum = new ArrayList<>();
        for(int i = 0;i <4; i++){
          int num = in.nextInt();
          arrnum.add(num);
        }
        in.close();
        System.out.println("The numbers are %d, %d, %d, %d".formatted(arrnum.get(0),arrnum.get(1),arrnum.get(2),arrnum.get(3)));

        Collections.sort(arrnum);
        int max = Collections.max(arrnum);
        System.out.println("The greatest number is %d".formatted(max)); 
    }
}
