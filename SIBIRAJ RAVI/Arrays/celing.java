public class celing {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,8,9,20};
        int target=8;

        int ans=celi( arr, target);
        System.out.println(ans);
    }
    static int celi(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // 3 mid

            if(arr[mid]<target){
                // 
                start=mid+1;
    
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return arr[mid+1];

            }
                
            }
            return arr[end+1];
        }
        
    }
    

