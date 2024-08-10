import java.util.Scanner;

public class sec_largest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("enter the num 1 : ");
            int num1=scan.nextInt();
            System.out.print("enter the num 2 : ");
            int num2=scan.nextInt();
            System.out.print("enter the num 3 : ");
            int num3=scan.nextInt();

            int largest=Math.max(num1,(Math.max(num2, num3)));
            int minimum=Math.min(num1, (Math.min(num2, num3)));
            int add=num1+num2+num3;
            int sec_largest=largest+minimum;

            System.out.println("the second largest number is : "+ (add-sec_largest));
        }
    }
    
}
