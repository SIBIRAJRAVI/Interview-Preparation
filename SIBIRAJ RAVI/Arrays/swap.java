import java.util.Arrays;
import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] arr=new int [5];
        System.out.print(" enter the value : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        swap(arr,0,1);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }
}