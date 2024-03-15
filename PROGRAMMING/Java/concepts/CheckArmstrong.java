package concepts;
import java.util.*;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        String str = String.valueOf(num);
        String[] arr = str.split("");
        long sum = 0;
        for (String s : arr) {
            int el = Integer.parseInt(s);
            sum += Math.pow(el, str.length());
        }
        if (sum == num) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }
}