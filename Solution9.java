
/* Write a Java program that reverses a string
 * without using any built-in functions or methods.*/
import java.util.*;

public class Solution9 {
    public static void ReverseString(String str) {
        String rev = "";
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            rev += str.charAt(idx);
        }
        System.out.print(rev);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ReverseString(str);
    }
}
