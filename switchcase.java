import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int a=Scan.nextInt();
        switch (a) {
            case 1:
                System.out.println(" you type 1");
                
                break;
            case 2:
                System.out.println("you type 2");
                break;
        
            default:
            System.out.println("you type greater than 2");
                
        }
    }
    
}
