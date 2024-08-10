import java.util.Scanner;

public class inverse_trianglr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the no of star you want : ");
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }


        
    }
    
}
