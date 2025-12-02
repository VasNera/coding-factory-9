package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/** Ο χρήστης προσπαθεί να μαντέψει ένα μυστικό αριθμό.
 *
 */
public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 42;

        System.out.println(" Please guess the secret number:");
        num = scanner.nextInt();

        if ( num == SECRET) {
            System.out.println(" You guessed the secret number!");
        } else {
            System.out.println(" You did not guessed the secret number!");


    }
}
}