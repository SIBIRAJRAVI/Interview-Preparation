import java.util.Scanner;

public class Sum_two_numbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int ans;
       

        while(true){
            System.out.print("Enter the num 1 ");
            int num1=scan.nextInt();
            System.out.print("Enter the num 2");
            int num2=scan.nextInt();
            ans =num1+num2;
            System.out.println(ans);



        }
    }
    
}
