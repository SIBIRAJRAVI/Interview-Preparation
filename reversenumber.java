public class reversenumber {
    public static void main(String[] args) {
        int a=56788;
        int temp=a;
       int count=0;
        while(a!=0){
            int b=a%10;
            count++;
            
            a=a/10;

        }
        if(count<3){
            System.out.println("no centre number");
        }
        else{
            int b=(int)Math.ceil(count/2);
            for(int i=1;i<=b;i++){
               
               temp=temp/10;
            //    int f=temp%10;
               


                


            }
            System.out.println(temp%10);

            


           
        }

    }
    
}
