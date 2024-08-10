public class EightShapePattern {
    public static void main(String[] args) {
        int size = 8; 
        int mid=size/2;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                if (i == 0 || i == size -1) {
                    System.out.print("*");
                } 
                
                
                
                else {

                    if (j == 0 || j == size - 1) {
                        System.out.print("*");
                    }
                     if(i==mid&&i!=size-1&&j!=size-1){

                         System.out.print("*");
                        
                     }
                    
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); 
        }
    }
}
