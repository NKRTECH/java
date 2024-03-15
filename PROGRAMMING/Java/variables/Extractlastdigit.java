package variables;

import java.io.*;
import java.util.*;

public class Extractlastdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int lastDigit = num % 10;
        System.out.println(lastDigit);
        in.close();
    }
}
