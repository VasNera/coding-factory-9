package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακέραιους απο το stdin
 * και υπολογίζει το αποτέλεσμα.
 */
public class AddScannerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println(" Παρακαλώ εισάγετε δυο ακεραίους.");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        // Εκτυπώση αποτελέσματος
        System.out.printf("Το άρθοισμα των %d και %d είναι ίσο με %d\n" , num1 , num2, sum);


    }
}



