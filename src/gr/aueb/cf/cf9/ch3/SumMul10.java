package gr.aueb.cf.cf9.ch3;

/**
 * Να βρούμε το άθροισμα των 10 πρώτων αριθμών.
 */
public class SumMul10 {

    public static void main(String[] args) {
        int mul = 1;
        int i = 1;
        int j=1;

        while (j <= 10) {
            mul *= j; //mul = mul + j
            j++;
        }

        System.out.println("mul = " + mul);
    }
}