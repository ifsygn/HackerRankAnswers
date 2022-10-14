package Java.Basic.Strings;

import java.util.Arrays;
import java.util.Scanner;
import com.ifsygn.util.array.ArrayUtil;

public class Anagrams {


    static boolean isAnagram(String a, String b) {
        // Complete the function

        int [] sumA = sumOfChar(sortString(a));
        int [] sumB = sumOfChar(sortString(b));

        //check
        ArrayUtil.print(sumA);
        ArrayUtil.print(sumB);

        return isEqualArray(sumA, sumB);
    }

    static boolean isEqualArray(int [] a, int [] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }


        return true;
    }

    static boolean isEqualArray(char [] a, char [] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;

            /*
            if (Character.compare(a[i],b[i]) == 0)
                continue;

             */
        }

        return true;
    }

    static int[] sumOfChar(char [] c) {

        int sum[] = new int[c.length];

        for(int i = 0; i < c.length; i++) {
            char temp = c[i];
            int count = 1;

            for(int j = i + 1; j < c.length; j++) {
                if(c[i] == c[j] & i != j) {
                    count++;
                }
            }
            sum[i] = count;
        }

        return sum;
    }

    static char[] sortString(String str) {

        str = str.toLowerCase();
        char [] temp = str.toCharArray();

        ArrayUtil.print(temp);

        char min;
        int minIndex;

        for (int i = 0; i < temp.length - 1; ++i) {
            min = temp[i];
            minIndex = i;

            for (int k = i + 1; k < temp.length; ++k)
                if (temp[k] - temp[i] < 0) {
                    min = temp[k];
                    minIndex = k;
                }
            temp[minIndex] = temp[i];
            temp[i] = min;
        }

        //check

        ArrayUtil.print(temp);

        return temp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        String a = scan.next();
        System.out.print("b: ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}