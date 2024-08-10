import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int b=1;
        int a=scan.nextInt();
        for (int i=1;i<=a;i++){
            b *=i;

            
        }
        System.out.println(b);
    }
    
}
