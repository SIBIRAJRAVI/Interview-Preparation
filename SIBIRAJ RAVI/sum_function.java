import java.util.Scanner;

public class sum_function {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.print("Enter The Num 1 : ");
            int num1=scan.nextInt();
            System.out.print("Enter The Num 2 : ");
            int num2=scan.nextInt();
            sum(num1,num2);
        }
    }
    static void sum(int a ,int b){
        int sum=a+b;
        System.out.println("The Sum Of Two Number Is : "+sum);
    }
}
