package gr.aueb.cf.cf9.ch6;

public class SwapWithArray {
    public static void main(String[] args) {


        int[] arr = { 1, 2};
        System.out.println("arr[0]= " + arr[0]);
        System.out.println("arr[1]= " + arr[1]);
        swap(arr);
        System.out.println("arr[0]= " + arr[0]);
        System.out.println("arr[1]= " + arr[1]);

    }
    public static void swap(int[] arr){

        if( arr.length != 2 )return;               // Θέλουμε να είναι ακριβώς δύο για να μπορούμε να κάνουμε swap
                                                  // γι αυτό βάζουμε διάφορο. ( Άν δεν είναι δυο δλδ σταμάτα.)

        int temp =arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
