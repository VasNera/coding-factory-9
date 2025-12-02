package gr.aueb.cf.cf9.ch4;

/**
 *  Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο
 *  των δεκα πρώτων ακεραίων.
 */
public class SumMullApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for ( int i = 1; i<=10;  i++ ){
            sum = sum + i;       // sum += i;
            mul = mul * i;       // mul *= i;
        }
        System.out.println(" sum " + sum);
        System.out.println(" mul " + mul);
    }
}
