import java.util.Scanner;

public class max_in_2d {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][]arr={
            {1,2,3,4,5},
            {6,7},
            {100,0,44}
        };
        max(arr);

    }
    static void max(int [][]arr){
        int max=arr[0][0];
        int min=arr[0][0];
        for(int row =0;row<arr.length;row++){
            // 3
            
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]);
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
            System.out.println();
        }
        System.out.println("The maximum value is : "+max);
        System.out.println("The minimum value is : "+min);
    
        
    }
    
}
