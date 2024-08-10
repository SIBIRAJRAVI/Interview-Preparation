
import java.util.*;
public class Bublesort {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the no of elements you want : ");
        int n=scan.nextInt();
        int []elements=new int[n];
        for(int i=0;i<n;i++ ){
            elements[i]=scan.nextInt();

        }
        int count =0;
        int m=0;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(elements[j]<elements[j-1]){
                    int temp=elements[j];
                    elements[j]=elements[j-1];
                    elements[j-1]=temp;
                    count++;
                }

            }
            m++;
            if(count==0){
                System.out.println(Arrays.toString(elements));
                break;
            }

        }
        System.out.println(Arrays.toString(elements));


        
    }

    
}