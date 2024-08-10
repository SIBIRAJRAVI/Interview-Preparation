import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int mark1=scan.nextInt();
        int mark2=scan.nextInt();
        int mark3=scan.nextInt();
        int mark4=scan.nextInt();
        int mark5=scan.nextInt();
        int Total=(mark1+mark2+mark3+mark4+mark5)/5;

        
        if(Total>=90 && Total <=100){
            System.out.println("grade a+ ");

        }
        else if(Total >=80)
        {
            System.out.println("grade a ");

        }
        else if(Total >=70 ){
            System.out.println("grade b+");
        }
        else if(Total>=60){
        System.out.println("grade b ");

        }
        else if(Total>=59){
            System.out.println(" you are fail");
        }

    }
    
}
