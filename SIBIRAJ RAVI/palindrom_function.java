import java.util.Scanner;

public class palindrom_function {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int num=scan.nextInt();
        isPalindrom(num);


    }
    static void isPalindrom(int a){
        int count=a;
        int lastdigit=0;
        int ans=0;
        while (count!=0) {
            lastdigit=count%10;

            count=count/10;
            ans=ans*10+lastdigit;

            
            
        }
        
        if(ans==a){
            System.out.println("it is palindrome ");
        }
        else{
            System.out.println("it is not palindrom ");
        }
    }
}
