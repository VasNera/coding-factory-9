package gr.aueb.cf.cf9.ch3;


import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης εισάγει ακειραίους και προσπαθεί να μαντέψει το secret.
 */
public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 42;

        while (true) {
           System.out.println(" Please guess the secret number");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println(" You guessed the number!");
                break;
            } else {
                System.out.println(" Guess again!");
            }
//            if (num != SECRET) {
//                System.out.println("Try again!");
//                continue;
//
//            }
//            System.out.println("You guess the secret number");   Μπορεί να γίνει και ετσι
//            break;                                               γίνεται πιο απλα.

        }
    }
}