
/*Write a Java program that reads a string from the user
 *and counts the frequency of each character
 *in the string using an array and a hashmap. */
import java.util.*;

public class Solution2 {
    public static void findtheFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> printMap : map.entrySet()) {
            System.out.println(printMap.getKey() + " " + printMap.getValue());

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        findtheFrequency(str);
    }
}
