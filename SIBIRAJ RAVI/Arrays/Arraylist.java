import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>a=new ArrayList<>();
        a.add(90);
        
        int n=5;
        for(int i=0;i<n;i++){
            a.add(i);
            if(a.get(i)==0){
                a.remove(i);
            }

        }

        System.out.println(a);

    }
    
}
