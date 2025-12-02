package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο Χρήστης είσαγει αριθμητή και παρονομαστή και
 * το πρόγραμμα υπολογίζει το ποιλίκο επαναληπτικά.
 * Αν ο αριθμητής είναι μηδέν τότε το πρόγραμμα διακόπεται.
 * Αν ο παρονομαστής είναι μηδέν, επειδή δεν μπορούμε να κάνουμε διαίρεση
 * με το μηδεν η διαδικασία επαναλαμβάνεται.
 */

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {

            System.out.println(" Παρακαλώ δώστε το αριθμητή");
            numerator = scanner.nextInt();
            if (numerator == 0) ;
            {
                System.out.println(" Numenator is 0. Quiting.");
                break;
            }


        }
        System.out.println(" Δωστε τον παρονομαστη");
        denominator = scanner.nextInt();
        while (true){


        if (denominator == 0) {
            System.out.println(" Can not dived by zero");
            continue;
        }
        result = numerator / denominator;
        System.out.println(" Result:" + result);

        }
    }
}