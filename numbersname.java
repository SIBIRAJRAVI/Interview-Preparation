import java.util.Arrays;
import java.util.Scanner;
public class numbersname {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int x[]=new int[3];
        String []middle={"eleven ","tewele ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
        String []second={"and ten ","and twenty ","and thirty ","and fourty ","and fivty ","and sixty ","and seventy ","and eighty ","and ninty "};
        String []first={" ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
        for(int i=2;i>=0;i--){
            x[i]=number%10;
            number=number/10;
        }
        System.out.println(Arrays.toString(x));
        String result="";
        result=first[x[0]]+"hundred ";
        if(x[1]==1){ 
            if(x[2]==0){
                result+=second[0];
            }
            else{
                result+=middle[x[1]];
                
            }
        }
        else{
            result+=second[x[1]-1];
            result+=first[x[2]];
        }
        System.out.println(result);





        
    }
    
}
