package gr.aueb.cf.cf9.ch1;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το
 * αποτέλεσμα στην κονσόλα.
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλήτων
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το ΄άρθροισμα των:" + num1 + "," + num2 + " είναι: " + result);
        System.out.printf("Το άρθροισμα των: %d, %d είναι: %d\n" , num1 , num2, result);

    }
}
