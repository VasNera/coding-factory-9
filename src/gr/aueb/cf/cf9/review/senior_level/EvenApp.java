package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        boolean result = false;

        // Είσοδος δεδομένων. Validation and data binding
        System.out.println(" Please enter a number: ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }

        num1 = scanner.nextInt();

        //Επιχειρησιακή λογική - Παραστάσεις.
        result = isEven(num1);

        // Εκτύπωση αποτελέσματος.
        System.out.println("The name is even:" + result);
    }

    /**
     * Checks if number is even.
     * @param num1
     * @return
     */
    public static boolean isEven(int num1){
        return num1 % 2 == 0;
    }
}
