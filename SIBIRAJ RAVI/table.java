import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        int ans;
        
        while(true){
            System.out.print("Enter which table want to print : ");
            int table=scan.nextInt();

            for(int i=1;i<=10;i++){
                ans=i*table;
                System.out.println(i +" x "+table +" = "+ans );
    
            }
            
        }

       
    
        
    }
    
}
