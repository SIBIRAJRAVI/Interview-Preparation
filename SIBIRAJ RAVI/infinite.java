import java.util.Scanner;

public class infinite {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ans=0;
        while(true){
            
            System.out.print("enter x to stop ");
            char a=scan.next().charAt(0);
            if(a=='x' || a=='X'){
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER : ");
            

                int num=scan.nextInt();
                ans+=num;
            }

            
            
        }
        System.out.println(ans);

    }
    
}
