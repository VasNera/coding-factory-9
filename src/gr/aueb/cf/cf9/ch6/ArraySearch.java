package gr.aueb.cf.cf9.ch6;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Αναζητά τη τιμή σε ένα πίνακα.
 */

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int value = 0;
        int position = 0;

        System.out.println(" Please enter a value: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);
        if (position == -1){
            System.out.println(" Value Not Found!");
        } else {
            System.out.println(" Value: " + value + " found at position: " + (position + 1));// Βάζουμε το +1 για να γίνει
        }                                                                         // πιο φιλικό προς τον χρήστη.
                                                                                 // Επειδή ειναι zero based Αντι να δει 0
                                                                               // δλδ αν είναι στη πρώτη θέση να δει 1.


    }


    /**
     * Επιστρέφει τη θέση του 1ου στοιχείου του πίνακα που
     * ισούται με τη τιμή αναζήτησης(VALUE). Αν δεν υπάρχει το στοιχείο
     * επιστρέφει -1
     *
     * @param arr   input πινακας
     * @param value η τιμή αναζήτησης
     * @return το position του πινακα που βρέθηκε το στοιχείο ή αν δεν βρεθεί -1.
     */

    public static int getPosition(int[] arr, int value) {

        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }

        }
        return positionToReturn;

    }

    // Δεύτερη εκδοχή του ίδιου πράγματος. Το ίδιο πράγμα με διαφορετικό τρόπο.

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
            return -1;
        }


    }


