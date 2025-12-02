package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μια θερμοκρασία.
 * Και το πρόγραμμα υπολογίζει αν η θερμοκρασία < 0 τότε μια μεταβλητή
 * γίνεται true, αλλιώς γίνεται false.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δήλωση και αρχικοποίηση
        int temperature = 0;
        boolean isTempBelowZero = false;

        //Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία");
        temperature = scanner.nextInt();

        // Επεξεργασία των Δεδομένων

        isTempBelowZero = temperature < 0;

        //Εκτώπωση αποτελεσμάτων
        System.out.println(" Η θερμοκρασία είναι μικρότερη από 0:" + isTempBelowZero);

    }
}
