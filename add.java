import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        // Adding 'b' to 'a' without using the + operator
        
        
        System.out.println("Result of adding without + operator: " +( a-(-b)));
        
        sc.close();
    }
}
