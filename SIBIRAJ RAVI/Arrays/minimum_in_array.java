import java.util.Scanner;

public class minimum_in_array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter how many elements want : ");
        int n=scan.nextInt();
        int[]arr=new int[n];
        System.out.print("enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        minimum_in_array(arr);

    }
    static void minimum_in_array(int []io){
        int min=io[0];
        for(int i=1;i<io.length;i++){
            if(io[i]<min){
                min=io[i];
                
            }
        }
        System.out.println("The minimum value is : "+min);
    }
    
}
