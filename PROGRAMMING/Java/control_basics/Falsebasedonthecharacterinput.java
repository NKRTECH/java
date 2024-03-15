package control_basics;
import java.util.*;

public class Falsebasedonthecharacterinput {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String charac = in.next();
        in.close();
        String vowel = "aeiou";
        int bool = vowel.indexOf(charac);
        if(bool != -1){
          System.out.print("True");
        }
        else{
          System.out.print("False");
        }

    }
}
