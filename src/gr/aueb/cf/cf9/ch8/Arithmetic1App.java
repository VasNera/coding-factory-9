package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Δημιουργείτε ένα arithmetic exception χωρίς να το χειριστούμε.
 */
public class Arithmetic1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Δώστε δυο ακεραίους: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        result = num1 / num2;     //αν το num2 είναι 0 βγάζει arithmetic exception.

        result = div(num1 , num2);
        System.out.println("Result: " + result);   // Δεν εκτελείτε αυτή η γραμμή.

    }

    public static int div(int num1 , int num2){
        return num1 / num2;
    }
}
