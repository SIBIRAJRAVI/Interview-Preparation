public class twodarray {
    public static void main(String[] arg) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    System.out.println(a[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                

            }
            System.out.println();
        } 
    }
    
}
