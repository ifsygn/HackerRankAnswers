package Java.Regex.MatchingSpecificString;
import java.util.*;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Regex_Test tester = new Regex_Test();
        System.out.print("Regex_Pattern: ");
        String s = sc.nextLine();
        tester.checker(s); //case sensitive

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Metni giriniz: ");
        String testString = sc.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(testString);
        int count = 0;
        while (m.find()) {
            count += 1;
        }
        System.out.format("Number of matches : %d", count);
    }
}