public class SecondGreatest {
    public static void main(String[] args) {
        int a = 8, b = 15, c = 18;
        
        
        int max = Math.max(a, Math.max(b, c));
        
        
        int min = Math.min(a, Math.min(b, c));
        
        
        int secondGreatest = a + b + c - max - min;
        
        System.out.println("The second greatest number  " + a + ", " + b + ", and " + c + " is: " + secondGreatest);
    }
}
