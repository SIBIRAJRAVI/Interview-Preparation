import java.util.Scanner;


public class vote_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        while (true) {
            System.out.print("Enter the age of Person : ");
            int age=scan.nextInt();
            check_eligible(age);


            
        }
    }
    static void check_eligible(int a){
        if(a >=18){
            System.out.println("You are Eligible for vote ");

        }
        else{
            System.out.println("You Are Not Eligible ");
        }
    }
    
}
