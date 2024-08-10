import java.util.Scanner;

public class max {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the no of elements need : ");
        int n=scan.nextInt();

        int []arr=new int[n];
        System.out.print("enter the elements : ");

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        max(arr);

    }
    static void max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the maximum value is : "+max);

    }
}
