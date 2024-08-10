import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String a=scan.nextLine();
        int n=a.length();
        int count=0;

        for(int i=0;i<n;i++){
            if(a.charAt(i)==a.charAt(n-i-1)){
                count++;

            }
           

        }
        if(count==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");

        }

    }
    
}
