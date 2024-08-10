import java.util.Scanner;

/**
 * whole_star
 */
public class whole_star {
   

     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the no of times to print : ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");

            }
            System.out.println();

        }
     }
}