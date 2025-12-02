package gr.aueb.cf.cf9.ch6;

/**
 * Έστω ότι αναπαριστούμε μεγάλους ακεραίους σε μορφή πίνακα
 * και θέλουμε να προσθέσουμε τη μονάδα.
 */

public class AddOneApp {

    public static void main(String[] args) {

    }

    public static int[] addOne(int[] arr){

        if (arr == null) return new int[0];

        int[] arrayOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--){
            sum =arr[i] + carry;
            arrayOut[i + 1] = sum %10;
            carry = sum / 10;

        }
        if (carry == 1){
            arrayOut[0] = 1;
        }
        return arrayOut;
    }
}
