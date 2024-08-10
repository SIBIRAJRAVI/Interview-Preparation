import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num=scan.nextInt();
        int temp=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                temp+=i;

            }
        }
        if(temp==num){
            System.out.println(" it is perfect number ");

        }
        else {
            System.out.println(" it is not perfect number ");
        }
        
    }
    
}
