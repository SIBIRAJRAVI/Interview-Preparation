import java.util.*;
import java.io.*;
public class exceptinhandiling {
    public static void main(String[] args) {
        try(FileReader f=new FileReader("C:\\Users\\sibir\\OneDrive\\Documents\\my intro sample.txt")
            
            Scanner scan=new Scanner(f);
            f.createNewFile();
        }catch(Exception e){
            System.out.println("file error"+e.toString());
        }
    }
    
}
