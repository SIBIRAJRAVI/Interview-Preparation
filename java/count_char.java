import java.util.Scanner;

public class count_char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        String a=scan.nextLine();

        int n=a.length();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                
                }

            }


        }
        System.out.println(count);
    }

    
}