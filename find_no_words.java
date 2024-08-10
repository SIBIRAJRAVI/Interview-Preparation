import java.util.Scanner;
public class find_no_words {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        char check=' ';
        int count=1;
        int n=word.length()-1;
        for (int i=0;i<n;i++){
            if(word.charAt(i)==check){
                if(word.charAt(i+1)==check){
                    count--;
                }
                count++;

            }

        }
        System.out.println("The string present in word is "+ count);

        
    }
    
}
