import java.util.Scanner;

public class currency {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the currency : ");
        int currency=scan.nextInt();
        double doller=currency*83.72;
        System.out.println("the doller value is "+Math.floor(doller) );
    }
}
