package control_basics;

import java.util.Scanner;

public class Greater_among_extracted_digits_post_decimal_point {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        in.close();
        int res1 = (int)(num1 * 10);
        int res11 = res1%10;
        int res2 = (int)(num2 * 10);
        int res22 = res2%10;
        if(res11>res22){
          System.out.print(res11);
        }
        else if(res22>res11){
          System.out.print(res22);
        }
        else{
          System.out.print("The numbers are equal");
        }
    }
}
