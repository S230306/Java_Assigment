
/* Write a Java program that reads a list of names from the user
 * and stores them in an array. Then, the program should create
 * a hash map where the keys are the first letters of the names
 * and the values are lists of names starting with that letter. */
import java.util.*;

public class Solution3 {
    public static void keyFirst(String[] arr) {
        // creating a HashMap.
        HashMap<Character, String> map = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            String str = arr[idx];
            map.put(str.charAt(0), str);
        }
        System.out.print(map);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.next();
        }
        keyFirst(arr);
    }
}
