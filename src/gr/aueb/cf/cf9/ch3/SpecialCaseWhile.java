package gr.aueb.cf.cf9.ch3;

public class SpecialCaseWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println(" Δεν μπαίνει ποτέ μέσα γιατί το i είναι μικρότερο του μηδέν");
        }

        while (i <= 1) {
            System.out.println("Τρέχει μια φορά");
            i++;
        }

        while (true) {
            System.out.println(" Ατέρμονη λούπα");
        }
    }
}
