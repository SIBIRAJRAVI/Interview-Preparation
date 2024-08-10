import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print(" Enter the units ");
        int unit=scan.nextInt();
        double ans=0;
        double rate1=1;
        double rate2=2;

        if(unit<=100){
            System.out.println("you got free under the hundred units");    
        }
        else if(unit<=200){
            ans=((unit-100)*rate2+(100*rate1));
            System.out.println("the bill ammount is "+ans);

        }
        
    }
}
    

