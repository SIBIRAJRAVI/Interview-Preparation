import java.util.Scanner;
public class changechar {
    public static void main(String[] args) {    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the char to change : ");
        char input=scan.next().charAt(0);
        if(input>='A' && input<='Z'){
            System.out.println((char)(a+32));
        }
        else if(input>='a' && input<='z'){
            System.out.println((char)(input-32));
        } 
        else{
            System.out.println("not a charecter "+input);
        } 
    }

    
}
