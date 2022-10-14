/*
    Prepare > Java > Strings > Java Substring Comparisons
    Link:    https://www.hackerrank.com/challenges/java-string-compare/problem

 */

package Java.Basic.Strings;
import java.util.Scanner;
public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        for(int i = 0; i <= s.length() - k; i++) {

            String tempStr = "";

            tempStr = s.substring(i, k + i);

            if(tempStr.compareTo(smallest) < 0) {
                smallest = tempStr;
            }

            if(tempStr.compareTo(largest) > 0) {
                largest = tempStr;
            }

        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

class OtherOutputFormattingSolution {
    public static void getLargestAndSmallest(String s, int k) {
        String smallest = s.substring(0, k);
        String Largest = s.substring(0, k);
        String result = "";

        for (int i = 0; i <= s.length() - k; i++) {
            result = s.substring(i, i + k);

            if (Largest.compareTo(result) < 0) {
                Largest = result;
                System.out.println(Largest);
            }
            if (smallest.compareTo(result) > 0) {
                smallest = result;
                System.out.println(smallest);
            }
        }
    }
}