package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calc Hours to Minute and Seconds
 */

public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int min = 0;
        int sec = 0;
        final int HOUR_TO_MIN = 60;
        final int HOUR_TO_SEC = 3600;
        System.out.println("Παρακαλούμε εισάγετε τις ώρες");
        hours = scanner.nextInt();
        min = hours * HOUR_TO_MIN;
        sec = hours * HOUR_TO_SEC;
        System.out.printf("Τα λεπτά είναι: %d\n", min);
        System.out.printf("Τα δευτερόλεπτα είναι: %,d\n", sec );

    }
}
