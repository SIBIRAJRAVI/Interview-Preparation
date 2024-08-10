import java.util.Scanner;

public class leapYear {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        while (true){

            System.out.print("enter the year : ");
            int year=scan.nextInt();
            if(year %4 ==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("leap year");
                    }
                    else{
                        System.out.println( " not a leap year");
                    }
                }
                else{
                    System.out.println("leap year");
                }

            }
            else{
                System.out.println(" not a leap year");
            }

            
                

            


        }
    }
}
    

