package gr.aueb.cf.cf9.ch7;

public class StrSplit {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        String[] tokens;
        tokens = s.split(" +");    //regular expression

        for (String token: tokens){
            System.out.println(token);
        }

    }
}
