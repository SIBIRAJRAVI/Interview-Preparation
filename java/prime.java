import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
        
    }
    
}
