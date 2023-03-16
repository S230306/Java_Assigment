
/*Write a program to find the first non-repeating character
 *in a given string using LinkedHashMap. */
import java.util.*;

public class Solution11 {
    public static void findNonRepeat(String str) {
        // creating a HashMap
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int idx = 0; idx < str.length(); idx++) {
            map.put(str.charAt(idx), map.getOrDefault(str.charAt(idx), 0) + 1);
        }
        for (int idx = 0; idx < str.length(); idx++) {
            if (map.get(str.charAt(idx)) == 1) {
                System.out.print(str.charAt(idx));
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        findNonRepeat(str);
    }
}
