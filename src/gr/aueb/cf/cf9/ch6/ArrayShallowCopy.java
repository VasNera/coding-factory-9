package gr.aueb.cf.cf9.ch6;

/**
 * Όταν κάνουμε copy references τοτε το copy ονομάζεται shallow και έχει
 * side effects
 */

public class ArrayShallowCopy {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;          //shallow  copy. Αντιγράφηκε ο δείκτης και έχουμε side effect.

        arr2[0]=1000;

        System.out.println(arr1[0]);

    }


}
