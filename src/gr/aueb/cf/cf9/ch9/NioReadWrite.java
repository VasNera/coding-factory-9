package gr.aueb.cf.cf9.ch9;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioReadWrite {
    public static void main(String[] args) {
        Path source = Path.of("C:/Users/b-ner/aueb.jpg");
        Path target = Path.of("C:/Users/b-ner/aueb-copy.jpg");
        try{
            binaryReadWrite(source, target);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );

    }
    public static void textReader(Path path)throws IOException{
        String text = Files.readString(                                  //functional programming
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(text);
    }
    public static void binaryReadWrite(Path source, Path target) throws IOException {

        try( var sourceStream = Files.newInputStream(source);                        //efficient streaming σε chunks
             var targetStream = Files.newOutputStream(target);){

             sourceStream.transferTo(targetStream);


        } catch (IOException e){
                 e.printStackTrace();
                 throw e;

        }
    }

}
