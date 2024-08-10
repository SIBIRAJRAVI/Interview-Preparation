import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number to start : ");
        int i=scan.nextInt();
        System.out.print("enter the range that you want to stop : ");
        int a=scan.nextInt();
        while(i<=a){
            
            int temp = 0;
            int num = 2;
            while(temp == 0 && num < i){
                if(i % num == 0) temp++;

                num++;
            }

            if(temp == 0) System.out.println(i);

            i++;
        }

       
        
        
       
            
            
    }
}
    

