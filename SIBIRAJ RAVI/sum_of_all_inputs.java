import java.util.Scanner;

public class sum_of_all_inputs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            ans+=num;
            if(num==0){
                break;
            }



            
        }
        System.out.println("the sum of all number is : "+ans);

    }
    
}
