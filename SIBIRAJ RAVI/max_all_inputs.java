import java.util.Scanner;

public class max_all_inputs {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=0;
        int num;
        while (true) {
            System.out.print("Enter the number : ");
            num=scan.nextInt();
            if(num>max) max=num;
            else max=max; 

            if(num==0){
                break;
            }
        }
        System.out.println(max);
    }
    
}
