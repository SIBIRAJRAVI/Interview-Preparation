import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();
        System.out.print("enter the range : ");
        int n=scan.nextInt();
        int count=1;
        while (count!=n) {
            if(num%count==0){
                System.out.println(count);
            }

            count++;
            
        }


        
    }


    
}