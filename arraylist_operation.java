import java.util.*;
public class arraylist_operation 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the how many value to check : ");
        int a=scan.nextInt();

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a;i++){
            int b=scan.nextInt();
            al.add(b);
        }
        for(int i=0;i<a;i++){
            
            int c=al.get(i);
            
            
            if(c % 2 ==0){
                int y=c*2;
                al.add(i, c);
                al.add(i + 2, y); 
                i += 1;
            }
                   
        }
        System.out.print(al);        
    }
    
}
