package gr.aueb.cf.cf9.ch9;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadersJavaIo {
    public static void main(String[] args) {

    }

    // O scanner είναι χρήσιμος για primitives και strings.
    public static void fileReader(String file) throws IOException{
        try(FileReader fr = new FileReader(file)){
            int bytesRead = 0;
            while ((bytesRead = fr.read()) != -1){
                System.out.print((char) bytesRead);
            }

        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }
    public static void bufferedReader(File file)throws IOException{
        try(BufferedReader bf = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = bf.readLine())!= null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }

}
