/*
Array Challenge
Have the function ArrayChallenge(arr) take the array of numbers stored in arr and return the string true
if any combination of numbers in the array (excluding the largest number) can be added up to equal
the largest number in the array, otherwise return the string false.

For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23.
The array will not be empty, will not contain all the same elements, and may contain negative numbers.

Examples
Input: new int[] {5,7,16,1,2}
Output: false
Input: new int[] {3,5,-1,8,12}
Output: true

 */

package coderbyte.ArrayChallange.Combination;
import java.util.*;
import java.io.*;

class Main {

  public static void main (String[] args) {
    // keep this function call here
    Scanner sc = new Scanner(System.in);

    int [] arr = stringLineToIntArray(sc.nextLine()," ");

    System.out.print(ArrayChallenge(arr));
  }

  public static boolean ArrayChallenge(int[] arr) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.sort(arr);
    for(int i: arr){
      list.add(i);
    }

    int maxNumber = list.get(list.size() - 1);
    list.remove(Integer.valueOf(maxNumber));
    System.out.println(list.toString());

    int n = list.size();
    for (int i = 0; i < (1 << n); i++) { //for (int i = 0; i < (1 << n); i++) {
      int sum = 0;

      // Print current subset
      for (int j = 0; j < n; j++) {
        // (1<<j) is a number with j.th bit 1
        // so when we 'and' them with the subset number
        // we get which numbers are present in the subset and which are not

        if ((i & (1 << j)) > 0) { //if ((i & (1 << j)) > 0) {
          sum += list.get(j);
        }
      }

      if(sum == maxNumber){
        return true;
      }
    }
    return false;
  }

  public static int [] stringLineToIntArray(String s)
  {
    return stringLineToIntArray(s," ");
  }

  public static int [] stringLineToIntArray(String s, String regex)
  {
    String [] strArr = s.split(regex);
    return stringArrayToIntArray(strArr);
  }

  public static int [] stringArrayToIntArray(String [] strArr)
  {
    int arrLength = strArr.length;
    int [] arr = new int [arrLength];

    for(int i = 0; i < arrLength; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }
    return arr;
  }
}