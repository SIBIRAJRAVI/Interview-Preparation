import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter How many elements you want : ");
        int n=scan.nextInt();
        System.out.print("the target element to find : ");
        int target=scan.nextInt();
        System.out.print("Enter the elements : ");
        int []arr=new int[n];
        int ans;
        
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int first=arr[0];
        int last=arr[arr.length-1];
         if(first < last){
             ans=binary_search(arr,target);
            System.out.println(ans);

         }
         else{
              ans=binary_decending(arr, target);
              System.out.println(ans);


        }
       
     }
     static int binary_decending(int []arr,int target){
         int start=0;
         int end=arr.length-1;
         while (start<=end) {
             int mid=start+(end-start)/2;
            
             if(target < arr[mid]){
                 start = mid +1;
             }
             else if(target > arr[mid]){
                 end=mid-1;

             }
             else{
                 return mid;
             }           
         }
         return -1;
        
     }

    static int binary_search(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid+1;

            }
            else{
                return mid;
            }           
        }
        return end;
        
    }
    
}
