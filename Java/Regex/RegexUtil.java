package Java.Regex;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RegexUtil {

    public static String dateStringRegexPattern()
    {
        return "\\d{2}\\D\\d{2}\\D\\d{4}"; //regex format of: 06-11-2015
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }


}