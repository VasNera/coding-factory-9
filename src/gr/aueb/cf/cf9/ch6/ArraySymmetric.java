package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός.
 * Συμμετρικός είναι ένας πίνακας αν διαβάζεται το ίδιο από την αρχή και το τέλος.
 * π.χ (1,2,3,3,2,1)
 */

public class ArraySymmetric {
    public static void main(String[] args) {
        int[] arr1 = { 1 ,2 ,3 ,4 ,3 ,2 ,1};
        int[] arr2 = {1, 2, 3, 3, 2, 1};

        System.out.println(" arr1 is symmetric: " + isSymmetric(arr1));
        System.out.println(" arr2 is symmetric:" + isSymmetric(arr2));

    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
