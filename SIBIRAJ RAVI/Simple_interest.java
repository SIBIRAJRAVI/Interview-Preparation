import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the priciple ammount : ");
        int p=scan.nextInt();
        System.out.print("enter the time : ");
        int t=scan.nextInt();
        System.out.print("enter the rate : ");
        double r=scan.nextDouble();

        double ans=(p*t*r)/100;
        System.out.println("ans is "+ans);

    }
    
}
