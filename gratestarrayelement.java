public class gratestarrayelement {
    public static void main(String[] args) {
        int []a={-4,-2,-5,-3};
        int b=a[0];
        int index=0;
        int sec_max=a[0];
        for(int i=1;i<a.length;i++){
            if(b<a[i]){
                b=a[i];
                index=i;

            }            
        }
        for(int i=1;i<a.length;i++){
            if((sec_max<a[i])&& i!=index){
                   sec_max =a[i];

                }
        }  

        
        
        System.out.println(sec_max);
    }
}
       
