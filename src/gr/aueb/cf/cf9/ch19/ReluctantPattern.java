package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * no greedy
 */

public class ReluctantPattern {
    public static void main(String[] args) {


        String str = "login;alice;pass;12345;";


        Pattern pattern = Pattern.compile(".*?;");      //το αγγλικο ερωτηματικο σημαινει as little as possible.
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
