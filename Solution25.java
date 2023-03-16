
/*Write a Java program to check whether a given number is Armstrong or not. */
import java.util.*;

public class Solution25 {
    public static void ArmStrongNum(int n) {
        int res = 0;
        for (int idx = n; idx > 0; idx /= 10) {
            int digit = idx % 10;
            int cube = digit * digit * digit;
            res = res + cube;
        }
        if (res == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArmStrongNum(n);
    }
}
