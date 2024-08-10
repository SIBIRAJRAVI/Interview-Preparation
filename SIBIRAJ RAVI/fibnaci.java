import java.util.Scanner;

public class fibnaci {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=0;
        int b=1;
        int count=0;
        System.out.print("enter the range");
        int n=scan.nextInt();
        System.out.println(a);
        // for(int i=1;i<n;i++){
            
        //     int c=a+b;
            
        //     a=b;
        //     b=c;
        //     System.out.println( c);
        // }

        // while loop
        System.out.println("this are from while loop");
        while(count!=n){
           int d=a+b;
           a=b;
           b=d;
           count++;
           System.out.println(d);
        }
        

    }
}