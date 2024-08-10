import java.util.Scanner;

public class product_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Num 1  : ");
            int num1=scan.nextInt();
            System.out.print("Enter the Num 2 : ");
            int num2=scan.nextInt();
            product(num1,num2);

            
        }
    }
    static void product(int a,int b){
        int ans =a*b;
        System.out.println("The Product of the value : "+ans);
    }
    
}
