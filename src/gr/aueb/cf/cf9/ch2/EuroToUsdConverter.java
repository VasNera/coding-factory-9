package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ενα πρόγραμα που λαμβάνει από τον χρήστη ένα ποσό σε ακέραιο euro
 * και το μετατρέπει σε δολλάρια των ΗΠΑ με βάση μια ισοδυναμία.
 * Π.χ Άν ο χρήστης δώσει 100 ευρω και η ισοδυναμία είναι 1 ευρω = 99 USA cents
 * τότε τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί σε 99 USA dollars.
 */
public class EuroToUsdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USA_CENTS = 99;
        int inputeuros = 0;
        int usaDollars= 0;
        int usaCents = 0;
        int remainingcents= 0;


        System.out.println("Please give us the amount of euros");
        inputeuros = scanner.nextInt();
        usaCents = inputeuros * EURO_TO_USA_CENTS;
        usaDollars = usaCents / 100;
        remainingcents = usaCents % 100;

        System.out.printf(" The amount of euros is: %d , The amount of dollars: is %d, The amount of cents is: %d\n", inputeuros, usaDollars, usaCents);










    }
}
