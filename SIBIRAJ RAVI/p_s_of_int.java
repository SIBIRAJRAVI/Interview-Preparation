import java.util.Scanner;

public class p_s_of_int {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1=scan.nextInt();
        int product=1;
        int sum=0;
        int ans=0;
        int temp=num1;
        while(temp!=0){
            int last_digit=temp%10;
            temp=temp/10;
            product*=last_digit;
            sum+=last_digit;
        }
        ans=product-sum;

        System.out.println("the answer is "+ans);

        // System.out.print("Enter the num 2 : ");
        // int num2=scan.nextInt();
        

    }
    
}
