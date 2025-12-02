package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη και το πρόγραμμα
 * επιστρέφει την ηλικία σε ημέρες, όπου θεωρούμε
 * ότι ένα έτος είναι 365 μέρες. Για παράδειγμα αν δοθεί
 * ηλικία 20 ετών το αποτέλεσμα είναι 7300 ημέρες.
 */
public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEARS = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλούμε εισάγετε την ηλικία σας");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEARS;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες %d\n" , inputAgeInYears , ageInDays);


    }
}
