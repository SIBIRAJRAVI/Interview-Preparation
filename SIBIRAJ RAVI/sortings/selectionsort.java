// import java.util.Arrays;
// import java.util.Scanner;

// public class selectionsort {
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter the no of elements want : ");
//         int n=scan.nextInt();
//         int []elements=new int[n];
        
//         System.out.print("enter the elements : ");
//         for(int i=0;i<n;i++){
//             elements[i]=scan.nextInt();
//         }
//         selectionsort(elements);
//         System.out.println(Arrays.toString(elements));


       

        


    
// }
// static void selectionsort(int[]elements){
//     for(int i=0;i<elements.length;i++){
//         int last=elements.length-i-1;
        
//         int max=findmax(elements);
//         swaplargest(elements,max,last);


//     }
// }
// static void swaplargest(int []arr,int max,int last){
    
//     for(int i=max;i<=last;i++){
//         if(arr[i]>arr[last]){
//             int temp=arr[i];
//             arr[i]=arr[last];
//             arr[last]=temp;
//         }
//     }
// }
// static int findmax(int []arr){
//     int max=0;
//     for (int i=0;i<arr.length;i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }

//     }
//     return max;
// }
    
// }
import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        int n = scan.nextInt();
        int[] elements = new int[n];
        
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            elements[i] = scan.nextInt();
        }
        
        selectionSort(elements);
        System.out.println("Sorted array: " + Arrays.toString(elements));
    }

    static void selectionSort(int[] elements) {
        for (int i = 0; i <= elements.length - 1; i++) {
            // Find the index of the maximum element in the unsorted part
            int maxIndex = findMaxIndex(elements, 0, elements.length - i - 1);
            
            // Swap the found maximum element with the last element of the unsorted part
            swap(elements, maxIndex, elements.length - i - 1);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start ; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
