import java.util.Scanner;

public class lenear_search {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the no of elements want : ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element to find : ");
        int target=scan.nextInt();
        System.out.print("Enter the value of Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

       boolean ans= search(arr,target);
       System.out.println(ans);

    }
    static boolean search(int []arr,int target){
        int i=0;
        if(arr.length<=0){
            return false;
        }
        while (i!=arr.length) {
            if(arr[i]==target){
                return true;
            }


            i++;
            
        }
        return false;
        
    }
    

    
}
