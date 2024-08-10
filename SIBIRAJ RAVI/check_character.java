import java.util.Scanner;

public class check_character {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the charater to check : ");
        char a=scan.next().charAt(0);
        
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("it is vowel");
            
        }
        else System.out.println("it is consonent");
    }
    
}
