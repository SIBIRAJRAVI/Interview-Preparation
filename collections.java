import java.util.*;
public class collections {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter how many inputs want to get : ");
        int n=scan.nextInt();
        
        
        ArrayList<Integer>al=new ArrayList<>();
        al.add(0,300);

        for (int i=0;i<n;i++){
            int value=scan.nextInt();
            al.add(value);
        }
        int b=al.get(2);
        

        for(int i:al){
            System.out.println(i);
        }
        System.out.println(al);
        System.out.println(b);
        

        
    }
    
}
