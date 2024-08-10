import java.util.Scanner;

public class search_in_given_range {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter how many elements want : ");
        int n=scan.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the element to Check");
        int target=scan.nextInt();
    


        System.out.print("Enter the start range : ");
        int start=scan.nextInt();
        System.out.print("Enter the End range : ");
        int end=scan.nextInt();
        System.out.println("Enter the elements : ");

        for(int i=0;i<n;i++){

            arr[i]=scan.nextInt();
        }
        boolean ans=search(arr,start,end,target);
        System.out.println(ans);

    }
    static boolean search(int []arr,int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;


    }
    
}
