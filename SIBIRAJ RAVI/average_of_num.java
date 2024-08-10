import java.util.Scanner;

public class average_of_num {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int ans=0;
        while(true){
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            ans+=num;
            

            count++;

            if(num==0){
                break;
            }

        }
        ans=(ans/count);
        System.out.println("the average is : "+ans);
    }
    
}
