import java.util.Scanner;

public class Prime_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            isprime(num);            
        }
    }
    static void isprime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            // System.out.println(i);
            if(a%i==0){
                count++;
                // System.out.println(i);
            }
        }
        if(count==2){
            System.out.println("It is prime number ");
        }
        else{
            System.out.println("it is not prime ");
        }
    }    
}





























































































































