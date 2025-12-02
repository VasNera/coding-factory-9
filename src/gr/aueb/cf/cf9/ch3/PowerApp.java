package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *  calculate the power of a number , a^n.
 *  a^n = a * a * a * a...
 *  power = base * base * base...
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = 0;
        int power = 0;
        int result = 1; // 1 γιατί αν πολλαπλασιάζεις με 0 βγαίνει πάντα 0.
        int i = 1; // μεταβλητή ελέγχου.

        System.out.println(" Παρακαλώ εισάγετε το base και το power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while( i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d\n" , base, power, result);

    }

}
