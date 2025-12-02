package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n με μέθοδο.
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int factorial = 0;

        System.out.println(" Enter a number ");
        num = scanner.nextInt();

        // Μόνο εδώ αλλάζει. Καλεί μια υπηρεσία ( την μέθοδο που έχουμε βάλει) για να της δώσει το αποτέλεσμα.
        factorial = facto(num);

        System.out.println(" The factorial of " + num + " is " +factorial);

    }
            // Calculates factorial of n

    public static int facto (int n){

        int factorial = 1;

        for (int i =1; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

