import java.util.Scanner;

public class pythagoren_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter the number 1 : ");
            int num1=scan.nextInt();
            System.out.print("Enter the Number 2 : ");
            int num2=scan.nextInt();
            System.out.print("Enter the number 3 : ");
            int num3=scan.nextInt();
            isPythagoren(num1,num2,num3);
        }
    }
    static void isPythagoren(int a,int b,int c){
        int left=((a*a)+(b*b));
        int right=c*c;
        if(left==right){
            System.out.println("it is pythogoren Triplet ");
        }
        else{
            System.out.println("not a Pythogren Triplet ");
        }
    }
}
