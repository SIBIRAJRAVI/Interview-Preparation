import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word=scan.nextLine();
        int a=0;
        int n=word.length()-1;
        for(int i=0;i<n;i++){
            if(word.charAt(i)!=word.charAt(n)){
                System.out.println("not a palindrom");
                a++;

            }
            n--;
        }
        if(a==0){
            System.out.println("palindrom");
        }
    }
    
}
