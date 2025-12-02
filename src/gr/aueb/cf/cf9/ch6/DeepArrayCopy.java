package gr.aueb.cf.cf9.ch6;

/**
 * defensive copy. Deep copy. Fresh copy.
 */

public class DeepArrayCopy {

    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 4, 5};
        int[] arrCopy;

        arrCopy = getArrayDeepCopy(arr);


    }
    public static int[] getArrayDeepCopy(int[]arr){

        int[] destinationArr = new int[arr.length];

        // Αντιγραφή περιεχομένων. Όχι δείκτων. Φτιάχνουμε μια νέα περιοχή
        // στο heap(destinationArr) και αντιγράφουμε τα περιεχόμενα του
        // arr στον destinationArr.

        for (int i = 0; i < arr.length; i++){
            destinationArr[i] = arr[i];

        } return destinationArr;

    }
}
