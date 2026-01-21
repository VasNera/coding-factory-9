package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Υποτίθεται ότι οι ημερομηνίες που θα δοθούν είναι σε Αμερικάνικο format
 * και εμείς θέλουμε να τα αναγνωρίσουμε σε Ελληνικό format.
 */

public class DateMatcher {

    public static void main(String[] args) {

        String date = "06/12/2024; aaab 11/05/1990 xxx";


        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()){
            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

//            String grDate = String.format("%s,%s,%s", day, month, year);

            String grDate = day +"/" + month + "/" +year;
            System.out.println(grDate);
            System.out.println();


        }
    }
}
