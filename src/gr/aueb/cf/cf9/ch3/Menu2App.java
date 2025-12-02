package gr.aueb.cf.cf9.ch3;



import java.util.Scanner;
/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης να επιλέξει exit. Είναι σαν το do- while με άλλο τρόπο.
 */
public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {    // Το true στην ουσία σημαίνει να μπει μέσα στη while. Ότι η συνθήκη είναι true
                          // Αν ήταν false δεν θα έμπαινε καθόλου. Αφου θα του λέγαμε ότι είναι λάθος στην ουσία.
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1.Εισαγωγή Αίτησης");
            System.out.println("2. Διαγραφή Αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
            if (choice ==3){
                break; // Το μπρεικ σημαίνει βγαίνει από το πρόγραμμα. όταν δίνουμε τον αριθμό που λέμε κάνει ''break''.
            }

        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα");

        }

    }

