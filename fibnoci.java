import java.util.Scanner;
public class fibnoci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        System.out.println("how many no want to print");
        int n=scan.nextInt();
        System.out.println(a);
        System.out.println(b);

        
        for(int i=1;i<=n-2;i++){
            int c=a+b;

            System.out.println(c);
            a=b;
            b=c;


        }
        

    }
    
}
