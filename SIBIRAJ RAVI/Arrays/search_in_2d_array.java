import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class search_in_2d_array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // System.out.print("enter how many row you want : ");
        // int n=scan.nextInt();
         System.out.print("Enter the Element to find : ");
         int target=scan.nextInt();
        int[][]arr={
            {1,2,3},
            {4,5},
            {6}
        };

        // System.out.print("enter the values : ");
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         arr[row][col]=scan.nextInt();
        //     }
            

        // }

        int ans=search(arr,target);
        System.out.println((ans));
    //      for(int[]i:arr)
    //      System.out.println(Arrays.toString(i));
     }
    static int search(int [][]arr,int target){

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return arr[row][col];
                }

            }
        }
        return Integer.MIN_VALUE;
    }
    
}
