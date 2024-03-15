package control_advanced;

import java.io.*;
import java.util.*;

public class CountVowels {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named CountVowels. */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String vowels = "aeiou";
        int vowelcount = 0;
        for(char c:str.toCharArray()){
          // System.out.print(c);
          if(vowels.contains(String.valueOf(c).toLowerCase())){
            vowelcount+=1;
          }
        }
        System.out.print(vowelcount);
    }
}
