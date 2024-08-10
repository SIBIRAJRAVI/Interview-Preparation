import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=scan.nextInt();
        int last_digit;
        int rev_digit=0;


        while (a!=0) {
            last_digit=a%10;
            a=a/10;
            rev_digit=(rev_digit*10)+last_digit;
            //another method :
            System.out.print(last_digit);

            
        }
        System.out.println();

        System.out.println("next one");
        
        System.out.println(rev_digit);

    }
    
}
