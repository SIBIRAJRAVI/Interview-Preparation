import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1=scan.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 =scan.nextInt();
        int ans=1;
        int n=Math.min(num1, num2);

        for(int i=1;i<=n;i++){
            if(num1 %i==0 && num2 % i ==0){
                ans=i;
                

            }
        }
        System.out.println(ans);

        //for lcm

        int lcm=(num1*num2)/ans;
        System.out.println("lcm is " +lcm);


    }
    
}
