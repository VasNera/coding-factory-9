package gr.aueb.cf.cf9.ch6;

/**
 * Traverse an array , διάσχιση, επίσκεψη και εκτύπωση.
 * Σημαίνει ότι διασχίζουμε τον πίνακα και βλέπουμε τι στοιχεία έχει μέσα.
 */

public class TraverseApp {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] grades = {10, 9, 8, 7, 6};
        int[] scores = new int[]{100, 90, 80, 70, 60};

        // traverse

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);                       // Πρέπει να προσέχουμε ότι
        }                                                      // i < grades και όχι <=. Αν βάλουμε <= βγαίνει σφάλμα
        for (int i = 0; i < grades.length; i++) {              // καθώς δεν υπάρχουν 5 θέσεις. Υπάρχουν length - 1 (δλδ 4)
            System.out.println(grades[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // enhanced for
        for (int grade : grades){
            System.out.println(grade);
        }
        for (int score : scores){
            System.out.println(score);
        }
    }
}