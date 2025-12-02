package gr.aueb.cf.cf9.ch5;

/**
 * Demo of addition method
 */

public class AddApp {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add( num1 , num2);             // Εδω καλούμε στην ουσία την μέθοδο add και της δίνουμε 2 κανονικές τιμές.

        System.out.println(" sum = " + sum);

    }

    public static int add(int a , int b){//μεθοδος

        //Δηλωση και αρχικοποιηση

//        int sum = 0;
//
//        // Επεξεργασια εισόδου
//
//        sum = a + b;
//
//        // Επιστροφή αποτελέσματος
//
//        return sum;

        return a + b;

    }



}
