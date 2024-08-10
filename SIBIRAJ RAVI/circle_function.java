import java.util.Scanner;

public class circle_function {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while(true){
            System.out.print("Enter The Radius : ");
            double Radius=scan.nextDouble();
            circumference(Radius);
            area(Radius);
        }
    }
    static void circumference(double a){
       double ans=Math.ceil((2*3.14)*a);
       System.out.println("the circumference of Circle : "+ans);
    }
    static void area(double a){
        double ans=Math.ceil((3.14)*a*a);
        System.out.println("The area of Circle : "+ans);
    }
    
}
