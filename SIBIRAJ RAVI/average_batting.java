import java.util.Scanner;

public class average_batting {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Score : ");
        long runs=scan.nextLong();
        System.out.print("Enter How many times out : ");
        int outs=scan.nextInt();

        if(outs==0){
            System.out.println("no average ");
        }
        else{
            long ans=(runs/outs);
            System.out.println("the average batting score is : "+ans);
        }


    }
}
