import java.util.Scanner;

public class even_function {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            iseven(num);
            System.out.print("Enter 'x' to stop : ");
            char a=scan.next().charAt(0);
            if(a=='x'||a=='X'){
                break;
            }

            
        }
    }
    static void iseven(int a){
        if(a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }

    }
}
