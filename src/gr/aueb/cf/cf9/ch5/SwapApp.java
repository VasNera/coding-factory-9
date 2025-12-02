package gr.aueb.cf.cf9.ch5;

/**
 * Ορίζει μια μέθοδο swap (int a , int b) η οποία θα ανταλλάσει
 * αμοιβαία τις τιμές a, b
 */
public class SwapApp {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.printf("a = %d , b = %d\n", a , b);

        swap(a , b);

        System.out.printf("a = %d , b = %d" , a , b);
    }


    public static void swap(int a , int b){          //void γιατί δεν επιστρέφει κάτι.

        //swaps two numbers.

        int temp = a;
          a = b;
          b = temp;

    }
}
