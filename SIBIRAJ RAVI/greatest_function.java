import java.util.Scanner;

public class greatest_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       

    //    int ans= sum(a,b,c);
    while (true) {
        System.out.print("Enter the num1 : ");
        int num1=scan.nextInt();
        System.out.print("Enter the num2 : ");
        int num2=scan.nextInt();
        System.out.print("Enter the num3 : ");
        int num3=scan.nextInt();

        
        
        max(num1,num2,num3);
        min(num1,num2,num3);
    
        System.out.print("Enter the X to stop : ");
        char a=scan.next().charAt(0);
        if (a=='x'||a=='X') break;
       


        
    }
   
        // System.out.println(ans);
        
    }

 
    public static void max(int a,int b,int c){
        int max=Math.max(a,Math.max(b, c));
        

        System.out.println("maximum value is : "+max);
       

        // return max;
    }
    static void min(int a,int b,int c){
        int minimum=Math.min(a, Math.min(b, c));
        System.out.println("Minimum Value : "+minimum);
    }

}
