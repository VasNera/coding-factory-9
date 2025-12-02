package gr.aueb.cf.cf9.ch4;

import java.util.IllegalFormatCodePointException;

public class ForeverApp {
    public static void main(String[] args) {

        int count = 0;

        for (;;){
           System.out.print("forever");
            count++;
          if ( count % 10 == 0) System.out.println();
          if ( count == 100) break;

        }

    }
}
