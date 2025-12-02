package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός Τελεστής demo. Βρίσκει τον μικρίτερο μεταξύ δύο ακεραίων που δίνει ο χρήστης.
 */

public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println( " Παρακαλώ δώστε 2 ακέραιους.");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 < num2){

            min = num1;
        } else {
            min = num2;
        }
        System.out.println(" the smallest number is :" + min);

        // τριαδικός τελεστής. Conditional assignement Αγγλικο ερωτηματικό και : μεταφράζεται if then else
        // min =  num1 < num2 ?  num1 : num2;
    }
}

