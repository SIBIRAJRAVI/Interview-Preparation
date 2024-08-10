import java.util.Scanner;
import java.util.*;

public class string_reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String name=scan.nextLine();
       String a=new StringBuilder(name).reverse().toString();
       System.out.println(a);
    }
    
    
}

 