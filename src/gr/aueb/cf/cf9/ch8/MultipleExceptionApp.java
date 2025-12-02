package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionApp {
    public static void main(String[] args) {
        File file = new File("test.txt");
        int num = 0;
        char ch = ' ';

       try(Scanner scanner = new Scanner(file)){
           ch = (char)System.in.read();
       }catch (FileNotFoundException e){
           System.out.println("File not found");
           e.printStackTrace();

       }catch (IOException e){
           System.out.println("Char read error");
           e.printStackTrace();
       }catch (Exception e){
           System.out.println("Something went wrong");
           e.printStackTrace();
       }

    }
}
