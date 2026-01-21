package gr.aueb.cf.cf9.ch19;

public class RegEx {
    public static void main(String[] args) {

        String s = "Hello";
        String s1 = "Hi";

        String s4 =".4";


        System.out.println(isHello(s));
        System.out.println(isHelloOrHi(s1));
        System.out.println(dotAndDigit(s4));

    }

    public static boolean isHello(String s){
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s){
        return s.matches("Hello|Hi");

    }

    public static boolean isHhello(String s){
        return s.matches("[Hh]ello");
    }

    /**
     * Ξεκινάει με Uppercase και ακολουθεί η λέξη coding.
     * @param s
     * @return
     */

    public static boolean startsWithUppercase(String s){
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithUpperOrLowerCase(String s){
        return s.matches("[A-Za-z]coding");
    }

    public static boolean startsWithLetter(String s){
        return s.matches("[a-zA-Z0-9_]coding");
    }

    //μεταχαρακτήρες

    public static boolean anyCharAndDigit(String s){
        return s.matches(".[0-9]");                // μπορεί να γίνει και έτσι    .\\d

    }

    public static boolean dotAndDigit(String s){
        return s.matches("\\.\\d");
    }

    public static boolean isDate(String s){
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean twoWords(String s){
        return s.matches(".*\\s+.*");
    }

    public static String reverse(String s){
        return s.replaceAll("(.+)\\s(.+)", "$2 $1");       //backreference-groups
    }

}
