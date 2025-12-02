package gr.aueb.cf.cf9.ch9;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        String inPutFile = "C:/Users/b-ner/aueb.jpg";
        String outPutFile = "C:/Users/b-ner/aueb-copy.jpg";
        try{
            binaryFileReadWrite(inPutFile , outPutFile);

        }catch (IOException e){
            System.out.println("Η αντιγραφή απέτυχε. ");

        }

    }

    public static void binaryFileReadWrite(String inPutFile, String outPutFile) throws IOException{
        final int BUFFER_SIZE = 8192; // 8KB
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inPutFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPutFile))) {
            while ((bytesRead =bis.read(buffer))!= -1){
                bos.write(buffer, 0 , bytesRead);
            }
            System.out.println("File written successfully.");
        } catch (IOException e){
            e.printStackTrace();
            throw e;

        }
    }
}