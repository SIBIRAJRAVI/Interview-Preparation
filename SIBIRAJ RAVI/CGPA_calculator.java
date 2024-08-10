import java.util.Scanner;

public class CGPA_calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter how many subjects you have : ");
        int n=scan.nextInt();
        int total_credit=0;
        int total_score=0;
        int temp=0;
        int credit=0;
        int score=0;
        int value=0;
        double ans;
        while(temp!=n){
            System.out.print("Enter the credit value : ");
            credit=scan.nextInt();
            total_credit+=credit;
            System.out.print("Enter the score value : ");
            score=scan.nextInt();
            total_score+=score;
            value+=(credit*score);            
            temp++;
        }
        System.out.println(total_credit+" credit");
        System.out.println(total_score+" score");
        ans=value/total_credit;
        System.out.println("your cgpa is : "+ans);

        
    }
    
}
