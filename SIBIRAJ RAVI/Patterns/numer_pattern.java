import java.util.Scanner;

public class numer_pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the n values : ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    
}
