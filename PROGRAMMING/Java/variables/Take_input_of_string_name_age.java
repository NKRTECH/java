import java.io.*;
import java.util.*;

public class Take_input_of_string_name_age {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        System.out.printf("My name is %s and my age is %d years.", name, age);
    }
}
