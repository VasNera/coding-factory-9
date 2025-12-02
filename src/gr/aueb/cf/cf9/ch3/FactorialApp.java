package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates factorial of a number
 * 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int num = 0;
        int factorial = 1;

        System.out.println( " Παρακαλώ εισάγετε μια τιμή:");
         num = scanner.nextInt();

        while (i <= num ) {
            factorial *= i;
            i++;
        }
        System.out.printf(" %d = %d\n" , num , factorial);

    }
}
