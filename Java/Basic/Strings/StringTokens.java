package Java.Basic.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String[] tokens = s.trim().split("[!,?._'@ ]+");

        if (s.trim().isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Arrays.asList(tokens).size());

            for (int i = 0; i < Arrays.asList(tokens).size(); i++) {
                System.out.println(tokens[i]);
            }
        }

        scan.close();
    }
}
