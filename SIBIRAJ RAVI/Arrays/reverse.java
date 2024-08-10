import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of Elements want : ");
        int n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("enter the value of elements : ");

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        reverse(arr);



    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        
        while (start<end) {
            swap(arr,start,end);
            


            start++;
            end--;
            
        }
        System.out.println(Arrays.toString(arr));
        
        
    }
    static void swap(int []arr,int start,int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


    }
    
}
