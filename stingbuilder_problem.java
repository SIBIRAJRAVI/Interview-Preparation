import java.util.*;
public class stingbuilder_problem {
    public static void main(String[] args) {
        char a=0;
        
        String para="pasw0rd!@ is a mix of 10 character including letters,numbers, and symbols.";
        for(int i=0;i<para.length();i++){
            
            char sort =para.charAt(i);
            
            for( int j=0;j<para.length();j++){
                char sort2=para.charAt(j);
                if(sort<sort2){
                    a+=j;

                }
               
                
                
                
            }
            
            
            

        }
        System.out.print(a);
        

        
        


     
    }
    
}
