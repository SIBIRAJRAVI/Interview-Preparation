import java.util.Scanner;

public class Comission_Percentage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the total ammount : ");
        int t_ammount=scan.nextInt();
        System.out.print("Enter the percentage rate : ");
        double p_rate=scan.nextDouble();

        double c_ammount=t_ammount*(p_rate/100);

        System.out.println("the comission ammount is : "+c_ammount);
    }
    
}
