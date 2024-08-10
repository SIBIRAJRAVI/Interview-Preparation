import java.util.Scanner;

public class real_world {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int August=30;
        int weakend1=6;
        int weakend2=7;
        int count=0;
        for(int i=1;i<=August;i++){
            if(i==weakend1){
                weakend1+=weakend1;
            }
            if(i==weakend2){
                weakend2+=weakend2;
            }
            if(i!=weakend1||i!=weakend2){
                if(i%2==0){
                    count++;
                    
                }
            }
          
        }

        System.out.println("this of the days he can go : "+count);
    }
    
    
}
