package concepts;

import java.util.ArrayList;
import java.util.List;

public class Convert_StringArray_To_ListInteger {
    public static void main(String[] args) {
        String[] stringArray = {"1", "2", "3", "4", "5"};
        List<Integer> integerList = convertToIntegerList(stringArray);
        System.out.println(integerList); // Output: [1, 2, 3, 4, 5]
    }

    public static List<Integer> convertToIntegerList(String[] stringArray) {
        List<Integer> integerList = new ArrayList<>();
        for (String str : stringArray) {
            integerList.add(Integer.parseInt(str));
        }
        return integerList;
    }
}
