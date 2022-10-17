package Algorithms.Warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float countPos = 0;
        float countNeg = 0;
        float countZero = 0;

        for(Integer val : arr) {
            if (val > 0) {
                countPos++;
            } else if (val < 0) {
                countNeg++;
            } else {
                countZero++;
            }
        }

        print(countPos / arr.size());
        print(countNeg / arr.size());
        print(countZero / arr.size());
    }

    public static void print(float fValue){
        System.out.printf("%.6f%n",fValue);
    }
}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}