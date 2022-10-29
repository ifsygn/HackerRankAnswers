/*
Problem Link: https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem?isFullScreen=true
Input : 123.456.abc.def
 */

package Java.Regex.MatchingSpecificString;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MatchingAnything {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();

        check(testString,"^.{3}\\..{3}\\..{3}\\..{3}$");
    }
    public static void check(String testString, String pattern){

        Pattern p = Pattern.compile(pattern);
        System.out.println(p);
        Matcher m = p.matcher(testString);
        System.out.println(m);
        boolean match = m.matches();
        System.out.format("%s", match);
    }
}
