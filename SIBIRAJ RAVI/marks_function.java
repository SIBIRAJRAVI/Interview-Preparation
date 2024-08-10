import java.util.Scanner;

public class marks_function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the subjects : ");
        int T_sub=scan.nextInt();
        // int subject=0;
         int ans=0;
        int count=0;
        // while (true) {
            while(count!=T_sub){
                System.out.print("Enter the mark of subject "+ count+" : ");
                int subject=scan.nextInt();
                ans+=subject;
                count++;
            }
            ans=ans/T_sub;
            grade(ans);
        //     System.out.print("Enter x to terminate : ");
        //     char check=scan.next().charAt(0);

        //     if(check=='x'||check=='X') break;
            
        // }
         


    }
    static void grade(int a){
        System.out.println("Your Average is : "+a);
        if(a>90){
            System.out.println("your grade is AA");
        }
        else if(a>80){
            System.out.println("Your Grade is AB");
        }
        else if(a>70){
            System.out.println("your grade is BB");

        }
        else if(a>60){
            System.out.println("Your Grade is BC");
        }
        else if(a>50){
            System.out.println("Your Grade is CD");
        }
        else if(a>=40){
            System.out.println("Your Grade is DD");

        }
        else {
            System.out.println("You  Got Fail !");
        }
    }
        



}
    

