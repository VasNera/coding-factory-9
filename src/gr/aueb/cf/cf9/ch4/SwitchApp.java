package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Εμφανίζουμε μενου στον χρήστη.
 * Ο χρήστης δίνει το choice.
 * Ανάλογα με το choice του χρήστη δίνουμε feedback.
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println(" Παρακαλώ επιλέξτε ένα από τα παρακάτω.");
            System.out.println("1. One-Player game");
            System.out.println("2. Two-Players game");
            System.out.println("3. Three-Players game");
            System.out.println("4. Exit ");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Start One-Player game");

                    break;
                case 2:
                    System.out.println("Start Two-Players game");
                    break;
                case 3:
                    System.out.println("Start Three-Players game");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while(choice != EXIT);
        System.out.println("Goodbye");


    }
}
