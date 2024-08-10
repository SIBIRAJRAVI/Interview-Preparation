import java.util.Scanner;

public class real_world1 {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
            int p_even=0;
            int p_odd=0;
            int neg=0;
         while(true){
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            
            if(num>0){
                if(num%2==0){
                    p_even+=num;
                }
                else{
                    p_odd+=num;

                }


            }
            else if(num==0){
                break;
            }
            else{
                neg+=(-1)*num;

            }
            
         }
         System.out.println("positive odd number : "+ p_odd);
         System.out.println("positive even number : "+p_even);
         System.out.println("negative number : "+(neg)*-1);
    }
    
}
