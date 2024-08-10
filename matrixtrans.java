public class matrixtrans {
    public static void main(String[] args) {
        int b[][]=new int[3][3];
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j <a.length;j++){
                b[i][j]=a[i][j];

               a[i][j]=a[j][i];
               a[j][i]=b[i][j];
               
            }
            break;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
