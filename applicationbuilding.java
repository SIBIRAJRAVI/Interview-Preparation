import java.util.Scanner;

public class applicationbuilding {
    static Scanner scan=new Scanner(System.in);
    public static void usermenu(int bal){
        do{
    
            System.out.println("press 1 to deposite the ammount : ");
            System.out.println("press 2 to Withdraw the ammount : ");
            System.out.println("press 3 to check balance the ammount : ");
            System.out.println("press 4 to exit the ammount : ");
            int option=scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("********* welcome to deposite section *********** ");
                    System.out.print("enter the deposite ammount : ");
                    int d_ammount=scan.nextInt();
                    bal+=d_ammount;
                    System.out.println(d_ammount+" your ammount is deposited ");
                    System.out.println(" your balance after deposite "+bal);
                    
    
                    
                    break;
                case 2:
                    System.out.println("*********** welcome to withdraw ammount ********* ");
                    System.out.print("enter the withdraw ammount : ");
                    int w_ammount=scan.nextInt();
                    if(w_ammount<=0){

                    
                    bal-=w_ammount;
                    System.out.println(w_ammount+" your ammount is withdrawn from account ");
                    System.out.println("remaining ammount "+bal);
                    }
                    else{
                        System.out.println("Invalid Ammount.....");
                    }
                    
                case 3:
                    System.out.println("welcome to check balance");
                    System.out.println(bal +"  this the ammount you have ");
                    break;
                    
                case 4:
                    System.exit(0);
            
                default:
                    break;
    
            }
        }while(true);
    
    }
    public static void main(String[] args) {
        String username_1 ="sibi";
        int password=1719;
        int count=0;
        int balance=10000;
        System.out.println("*********************WELCOME TO THE ATM SERVICE*********************88");

        System.out.print("Enter the 1 for user :");
       
        int choice=scan.nextInt();

        

        switch (choice) {
            case 1:
                System.out.println("*********** WELCOME TO THE USER LOGIN ***********");
                
                System.out.print("enter the user name : ");
                scan.nextLine();
            
                String chech_user=scan.nextLine();
                
                System.out.print("enter the password : ");
                
                int chech_password=scan.nextInt();
                
                if(username_1.equals(chech_user)){
                    if( password == chech_password){
                        
                        System.out.println("********* Welcome Mister "+username_1);
                        usermenu(balance);

                       
                        

                        
                    }
                    else{
                        for(int i=0;i<=2;i++){
                            if(password !=chech_password){
                                count++;
                                System.out.print(" wrong pin ! please verify the password ");
                                System.out.println("the attempt over "+count+" chance");
                                System.out.print("enter your password : ");
                                int check_password_2=scan.nextInt();
                                
                                if(check_password_2==password){
                                    System.out.println("********* Welcome mister "+username_1+" **********");
                                    usermenu(balance);
                                    break;

                                }
                                else {
                                    count++;
                                    System.out.print(" wrong pin ! please verify the password ");
                                    System.out.println("the attempt over "+count+" chance");
                                    System.out.print("enter your password : ");
                                    int check_password_3=scan.nextInt();
                                    if(check_password_3==password){
                                        System.out.println("********* Welcome mister"+username_1+" ***********");
                                        usermenu(balance);
                                        break;

                                    }

                                }
                            if(i==2){
                                System.out.println(" your account is blocked ");
                            }
                                
                            }

                           
                        }
                    }
                } 


                
                break;
        
            default:
                break;
        }



    }
    
    

}
