import java.util.Scanner;

public class Check_repeted {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number : ");
        int a=scan.nextInt();
        System.out.print("enter the number to check : ");
        int b=scan.nextInt();
        int count=0;
        int last_digit;

        while(a!=0){
            last_digit=a % 10;
            a=a/10;
            if(last_digit==b){
                count++;
            }
           

        }

        System.out.println(count);
    

        while(a!=0){
            last_digit=a % 10;
            a=a/10;
            if(last_digit==b){
                count++;
            }
           

        }
    }
    
}
