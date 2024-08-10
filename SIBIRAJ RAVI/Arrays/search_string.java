import java.util.Arrays;
import java.util.Scanner;

public class search_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name =scan.nextLine();
        System.out.print("Enter the character to find : ");
        char target=scan.next().charAt(0);

        boolean ans=search_string(name,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()).toUpperCase());
        
    }
    static boolean search_string(String name,char target){

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }

        }
        return false;
    }
    
}
