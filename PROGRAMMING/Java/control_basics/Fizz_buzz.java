package control_basics;

import java.util.Scanner;

public class Fizz_buzz {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<num+1;i++){
          if(i%3==0){
            System.out.print("Fizz ");
          }
          else if(i%5==0){
            System.out.print("Buzz ");
          }
          else{
            System.out.print("%d ".formatted(i));
          }
        }
    }
}
