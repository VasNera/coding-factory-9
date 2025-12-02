package gr.aueb.cf.cf9.ch6;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * first in first out.
 */

public class QueueApp {
    static int [] queue = new int [10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);

        printQueue();

        num = dequeue();
        System.out.printf("Dequeued: " + num);
        System.out.println();
        printQueue();


    }
    public static void enqueue(int val){

        if (isFull()){
            throw new RuntimeException(" Is full!");

        }
       queue [++ top] = val;


    }
    public static int dequeue(){
        int num;

        if (isEmpty()){
            throw new RuntimeException("Is empty!");}

         num = queue[0];
        queue = Arrays.copyOfRange(queue, 1 , queue.length + 1);
        top --;
        return num;

    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static boolean isFull(){
        return top == queue.length - 1;

    }
    public static void printQueue(){
        if (isEmpty()){
            throw new RuntimeException(" Is Empty!");

        }
        for (int i = 0; i<=top; i++){
            System.out.println(queue[i]);
        }
    }
}
