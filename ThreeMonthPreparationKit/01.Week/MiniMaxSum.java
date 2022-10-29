import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long total = 0;

        for(int j = 0; j < arr.size(); j++) {
            total += arr.get(j);
        }

        /*
        for (Integer integer : arr) {
            total += integer;
        }
         */

        long sum0 = total - arr.get(0);

        long minSum = sum0;
        long maxSum = sum0;

        for(int i = 1; i < arr.size(); i++) {
            long sum = total - arr.get(i);

            if(sum < minSum)
                minSum = sum;

            if(sum > maxSum)
                maxSum = sum;
        }

        System.out.print(minSum + " " + maxSum);
    }
}

    /*
     public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long minCount=0;
        long maxCount=0;

        for(int i=0;i<arr.size()-1;i++){
            minCount=minCount+arr.get(i);
        }
        for(int i=arr.size()-1;i>0;i--){
            maxCount=maxCount+arr.get(i);
        }
        System.out.print(minCount+" "+maxCount);
    }
}
     */

    /*
    public static void miniMaxSum(List<Integer> arr) {
        long maxNum = arr.get(0);
        long minNum = arr.get(0);
        long sum = 0;
        for(Integer i:arr) {
            sum += i;
            if(i > maxNum)
            {
                maxNum = i;
            }
            if(minNum > i)
            {
                minNum = i;
            }
        }
            System.out.println((sum - maxNum)+" "+(sum - minNum));
    }
     */