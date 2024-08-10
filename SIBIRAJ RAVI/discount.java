import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the ammount : ");
        int o_ammount=scan.nextInt();
        System.out.print("Enter the discount rate : ");
        double d_rate=scan.nextDouble();

        double discount=o_ammount*(d_rate/100);
        double ans=o_ammount-discount;

        System.out.println("the ammount after discount is : "+ans);
        System.out.println(100*0.1);
    }
    
}
