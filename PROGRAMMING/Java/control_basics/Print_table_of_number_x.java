package control_basics;

import java.util.Scanner;

public class Print_table_of_number_x  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.print("%d ".formatted(num * i));
        }
        in.close(); // Close the scanner
    }
}
