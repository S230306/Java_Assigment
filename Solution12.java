
/*Write a program to count the number of words in a given sentence. */
import java.util.*;

public class Solution12 {
    public static void countNumberOfWord(String str) {
        int count = 1;
        for (int idx = 0; idx < str.length(); idx++) {
            if (str.charAt(idx) == ' ') {
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        countNumberOfWord(str);
    }

}
