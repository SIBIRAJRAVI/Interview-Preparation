import java.util.Scanner;

public class distance_of_two_points {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the x1 co-ordinate : ");
        int x1=scan.nextInt();
        System.out.print("Enter the x2 : ");
        int x2=scan.nextInt();
        System.out.print("enter y1 co-ordinate : ");
        int y1=scan.nextInt();
        System.out.print("Enter the y2 co-ordinate : ");
        int y2=scan.nextInt();
        double ans;
        ans=Math.ceil(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));

        System.out.println("the distance between the two point : "+ans);
    }
    
}
