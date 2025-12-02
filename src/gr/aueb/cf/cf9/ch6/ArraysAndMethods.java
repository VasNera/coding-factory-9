package gr.aueb.cf.cf9.ch6;

/**
 * Arrays and Methods.
 * Demo of how we pass an array as formal parameter
 * and also how we return an array from a method.
 */

public class ArraysAndMethods {
    public static void main(String[] args) {


        int[]arr = {1 , 2, 3, 4, 5};
        printArray(arr);
        printArray(arr , 0 , arr.length);

    }

    /**
     *  prints the contents of array
     * @param arr    -> the input array
     */
    public static void printArray(int[]arr){
        for(int item : arr) {
            System.out.println( item + "  ");
        }
    }

    public static void printArray(int[]arr , int low , int high){

        // τσεκ για σφάλματα.

        if (low < 0 || high > arr.length){
            return;
        }
        if (low > high){
            return;
        }
        for (int i = low; i < high; i++){
            System.out.println(arr[i] + " ");
        }

    }

    public static int[] getArray5(){
        return new int[5];
    }





}
