import java.util.Scanner;

public class gretest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number 1 : ");
        int num1=scan.nextInt();
        System.out.println("enter the number 2 : ");
        int num2=scan.nextInt();
        int ans=Math.max(num1, num2);
        System.out.println(ans);

        }
    
}
