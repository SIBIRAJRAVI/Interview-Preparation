import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintCode {
    public static void main(String[] args){
//        Path file = Path.of("/home/ranjith/java/Placement class/PlacementClass7thSem/PrintCode.java");
//        String filewords = Files.readString(file);

        try (BufferedReader br = new BufferedReader(new FileReader("PrintCode.java"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
