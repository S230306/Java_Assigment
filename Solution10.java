
/*Write a program to convert a given string to lowercase. */
import java.util.*;

public class Solution10 {
    public static void ConvertString(String str) {

        System.out.print(str.toLowerCase());

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ConvertString(str);
    }
}
