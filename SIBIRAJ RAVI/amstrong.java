import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the number : ");
        int a=scan.nextInt();
        // int ans=0;
        int count=0;
        int last_digit;
        int digit=0;
        int b=a;
        int c=a;
        while(c!=0){
            
            c=c/10;
            count++;    

        }
        while(b!=0){
            last_digit=b%10;
            b=b/10;
            digit+=Math.pow(last_digit,count);

        }
        if(a==digit){
            System.out.println(digit+ " is amstrong number ");
        }
        else{
            System.out.println(digit+" is not a amstrong");
        }

    }
    
}
