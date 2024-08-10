import java.util.Scanner;

public class flooring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter how many elements want : ");
        int n=scan.nextInt();
        System.out.print("enter the target  : " );
        int target=scan.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();

        }
        int ans=flooring(arr, target);
        System.out.println(ans);

    }
    static int flooring(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            
            }
            else {
                return arr[mid-1];
            }
            
        }
        return 0;

    }
    
}
