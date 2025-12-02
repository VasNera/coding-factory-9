package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακεραίου με τη χρήση
 * του τριαδικού τελεστή. Το απόλυτο ενός ακεραίου είναι θετικός πάντα.
 *  Για παράδειγμα, το απόλυτο του -5 είναι 5 και το απόλυτο του 5
 *  είναι 5 επίσης.
 */

public class AbsTernaryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int abs = 0;

        // input - Είσοδος δεδομένων.
        System.out.println(" Please enter a number:");
        num = scanner.nextInt(); //data binding

        // Επεξεργασία δεδομένων.

        if ( num >= 0) {
            abs = num;
        }
        else {
            abs = - num;
        }

        // Τριαδικός τελεστής. Γίνεται και έτσι. Συντομογραφία του απο πάνω.
        // abs = ( num >= 0) ? num : -num;  expression

    }
}
