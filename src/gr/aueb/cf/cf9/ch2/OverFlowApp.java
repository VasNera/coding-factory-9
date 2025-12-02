package gr.aueb.cf.cf9.ch2;


/**
 *  Προσθέτει δυο ακέραιους και το αποτέλεσμα
 *  δημιουργεί υπερχείληση ( overflow)
 */
public class OverFlowApp {


    public static void main(String[] args) {

        int num1 = Integer. MAX_VALUE;
        int num2 = 1;
        int result = 0;


        //Εντολές

        result = num1 + num2;


        // Εκτύπωση αποτελεσμάτος

        System.out.println("Το αποτέλεσμα είναι:" + result);
    }

}
