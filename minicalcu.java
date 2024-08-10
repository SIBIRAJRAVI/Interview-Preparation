import java.util.Scanner;
import java.util.*;
public class minicalcu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the  number 1 : ");
        int num1=scan.nextInt();
        System.out.print("enter the number 2 : ");
        int num2=scan.nextInt();
        System.out.print("enter your choices : ");
        System.out.println("1 is for addition");
        System.out.println("2 is for subtract");
        System.out.println("3 is for multiplication");
        System.out.println("4 is for divition");
        System.out.println("5 maximum num");
        System.out.println("6 for min");
    

        

        int b=scan.nextInt();

        switch (b) {
            case 1:
            System.out.println("the addition of num is"+(num1+num2));

                
                break;
            case 2:
            System.out.println("the subtract of num is "+(num1-num2));
            break;
            case 3:
            System.out.println("the multiply of num is "+(num1*num2));
            break;
            case 4:
            System.out.println("the divition of num is "+(num1/num2));
            break;
            case 5:
            System.out.println("the greatest of two "+ Math.max(num1,num2));
            break;
            case 6:
            System.out.println("the minimum of two "+ Math.min(num1,num2));
            break;
            case 7:
            System.out.println("the sqrt of two "+ Math.sqrt(num1+num2));
            break;


        
            default:

                break;
        }

        
    }
    
}
