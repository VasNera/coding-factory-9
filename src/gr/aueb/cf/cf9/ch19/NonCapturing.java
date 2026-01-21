package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * recognise but not capture.
 */

public class NonCapturing {

    public static void main(String[] args) {
        String s1 = "HelloWorld HelloWorld";


        Pattern pattern = Pattern.compile("(Hello)(World)");
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            for (int i = 0; i <=matcher.groupCount(); i++){
                System.out.print(matcher.group(i) + " ");

            }
            System.out.println();
        }

    }

}
