package gr.aueb.cf.cf9.ch6;

public class ArrayMin {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[]arr){
        if (arr == null || arr.length == 0 )return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for ( int i = 1 ; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;


    }

    // Άλλος τρόπος να βρεις τη μικρότερη τιμή

    public static int getMinPosition2(int[]arr){
        if (arr == null || arr.length < 1 ) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length ; i ++ ){
                if (arr[i] < minValue) {
                    minPosition = i;
                    minValue = arr[i];
                }
                } return minValue;
            }

            // Για max value.

    public static int getMaxPosition(int[]arr){
        if (arr == null || arr.length == 0 ) return -1;

        int maxPosition = 0;
        int maxValue = arr[ maxPosition];

        for (int i = 1; i < arr.length ; i++){
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;

    }

    }

