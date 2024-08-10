import java.util.Scanner;

public class factorial_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("Enter the numbers : ");
            int num=scan.nextInt();
            factorial(num);
        }
    }
    static void factorial(int a){
        int ans=1;
        int i;
        for( i=1;i<=a;i++){
         ans*=i;
        }
        System.out.println("the factorial is "+ans);
    }
}
