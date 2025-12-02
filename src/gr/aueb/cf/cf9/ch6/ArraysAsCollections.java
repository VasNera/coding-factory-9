package gr.aueb.cf.cf9.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[]arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15};

    }

    public static int[] filterEven(int[]arr){
        if (arr == null || arr.length == 0) return new int[0];

        int count = 0;
        for (int el : arr){
            if (el % 2 == 0) count++;


        }
        int[]arrayToReturn = new int[count];
        for (int i = 0; i < count; i++){
            if (arr[i] % 2 == 0){
                arrayToReturn[i]= arr[i];
            }
        }
        return arrayToReturn;

    }

    public static int[] mapToDouble(int[]arr){
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length ; i++){
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[]arr){
        int sum = 0;
        for (int el: arr){
            sum *= el;

        } return sum;
    }

    public static double avg(int[]arr){
        return sum(arr) /(double) arr.length;

    }
    public static boolean anyEven(int[]arr){
        for (int el:arr){
            if (el % 2 ==0)return true;

        }return false;
    }

    public static boolean allEven(int[]arr){
        for(int el: arr){
            if( el % 2 !=0 ) return false;
        }
        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;
//        for (int el : arr) {
//            if (el % 2 == 0) count++;
//        }
//        return count > 2;

        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 2) return true; // early exit
        }
        return false;
    }

}

