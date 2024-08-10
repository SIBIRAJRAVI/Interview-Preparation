import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        int [][]accounts={
            {1,5},
            {7,3},
            {3,5},
            
        };
        System.out.println(accounts.length);
        int max=0;
        int result=0;
        
        for(int row =0;row<accounts.length;row++){
            int ans=0;
            for(int col=0;col<accounts[row].length;col++){
                ans+=accounts[row][col]; 
            }
            if(ans>max){
                max=ans;
            }    
        }
        System.out.println(max);   
    }
    
}
