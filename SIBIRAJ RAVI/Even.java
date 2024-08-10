import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number%2==0){
            System.out.println("it is even");
        }
        else System.out.println("odd");
    }
    
}
