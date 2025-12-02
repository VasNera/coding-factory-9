package gr.aueb.cf.cf9.ch5;

public class FloatingExpressionsApp {
    public static void main(String[] args) {

        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = 0.0;
        result = intNum + floatNum + doubleNum; // Όλα μετατρέπονται στον μεγαλύτερο τύπο.

        System.out.println("result is: "+ result);


    }
}
