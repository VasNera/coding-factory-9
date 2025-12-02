package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Δίνει ο χρήστης έναν αριθμό και του επιστρέφουμε τον χαρακτηρισμό.
 */
public class GradeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = 0;

        System.out.println(" Παρακαλούμε δώστε τον βαθμό. ");
        grade = scanner.nextInt();

        switch (grade){
            case 1:                // Το case είναι σαν να χρησιμοποιούμε το if. Δλδ είναι
            case 2:                // σαν να γράφουμε if (grade ==1 ); if (grade ==2) κτλ.
            case 3:
            case 4:
                System.out.println("Κάτω από τη βάση.");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς. ");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν Καλώς. ");
                break;
            case 9:
            case 10:
                System.out.println(" 'Αριστα. ");
                break;
            default:
                System.out.println(" Ο βαθμός πρέπει να είναι από το 1-10");
                break;
        }

    }
}
