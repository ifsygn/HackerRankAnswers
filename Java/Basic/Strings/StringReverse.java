package Java.Basic.Strings;
import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir yazı giriniz: ");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        if (isPalindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char cLeft = Character.toLowerCase(s.charAt(left));

            if (!Character.isLetter(cLeft)) {
                ++left;
                continue;
            }

            char cRight = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetter(cRight)) {
                ++right;
                continue;
            }

            if(cLeft != cRight)
                return false;
            ++left;
            --right;
        }
        return Character.isLetter(s.charAt(left));
    }
}