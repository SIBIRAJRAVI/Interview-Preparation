import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the base value : ");
        int base=scan.nextInt();
        System.out.print("Enter the pow value : ");
        int pow=scan.nextInt();
        int result=1;

        for(int i=0;i<pow;i++){
            result*=base;

        }
        System.out.println("the pow value is "+result);
        // another method
        System.out.println(Math.pow(base, pow));
    }
    
}
