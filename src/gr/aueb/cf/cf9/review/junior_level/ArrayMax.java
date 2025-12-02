package gr.aueb.cf.cf9.review.junior_level;

/**
 *  Οι μεταβλητες δεν ειναι καλα ονοματα.
 *  Ο κωδικας θα μπορούσε να είναι μέθοδος.
 *  Δεν έχει δομή.
 *  Δεν έχει docs.
 *  Δεν υπάρχει έλεγχος για κενό array.
 */

public class ArrayMax {
    public static void main(String[] args) {



    int[] a = { 1,2,3,4,5,6,7,8,9,15};
    int m = a[0];

    for(int i = 1 ; i < a.length ; i ++) {
        if (a[i] > m){
            m = a[i];
        }

    }
        System.out.println(m);
    }


}
