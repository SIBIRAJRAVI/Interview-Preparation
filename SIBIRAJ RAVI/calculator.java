import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        
        System.out.println("+ for addition");
        System.out.println("Enter - for substraction");
        System.out.println("enter * for multiplication");
        System.out.println("enter / for division ");
        System.out.println(" enter % for remeinder");
        System.out.println("enter the ' x'or X' for exit "); 
        
        while (true) {
            System.out.print("enter the num 1 : ");
            int num1=scan.nextInt();
            System.out.print("Enter the num 2 : ");
            int num2=scan.nextInt();
            System.out.print("Enter the operator : ");
            char a=scan.next().charAt(0);
             
        switch (a) {
            case '+':
                System.out.println(num1+num2);

                
                break;
            case '-':
            System.out.println(num1-num2);

            
            break;
            case '*':
            System.out.println(num1*num2);

            
            break;
            case '/':
            System.out.println(num1/num2);

            
            break;
            case '%':
            System.out.println(num1%num2);

            
            break;

        

        
           
        }
        if(a=='x'||a=='X'){
            break;

        }
            
        }

       

    }
    
}
