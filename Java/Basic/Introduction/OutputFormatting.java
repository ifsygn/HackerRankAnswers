/*
    Prepare > Java > Introduction > Java Output Formatting
    Link:   https://www.hackerrank.com/challenges/java-output-formatting/problem
 */

package Java.Basic.Introduction;
import java.util.Scanner;

//format printf String syntax and Integer syntax
public class OutputFormatting {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%0,3d%n", s1, x);
        }
        System.out.println("================================");

    }
}

