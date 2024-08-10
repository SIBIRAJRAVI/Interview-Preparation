import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("press 1 to find the primeter and area of circle");
        System.out.println("Press 2 to find the primeter and area of square");
        System.out.println("Press 3 to find the primeter and area of rectangle");
        System.out.println("for rectangle press 4 ");

        int a=scan.nextInt();


        switch (a) {
            case 1:
                System.out.println("enter the radious of circle");
                Double radious=scan.nextDouble();

                System.out.println("the premeter of the circle is "+(2*3.14)*radious);
                System.out.println("the area of the circle is "+3.14*(radious*radious));
                System.out.println("press 3 for rectangle");


                
                break;
                case 2: 
                               System.out.println("enter the side of square");
                Double side=scan.nextDouble();

                System.out.println("the premeter of the square is "+(side*side));
                System.out.println("the area of the circle is "+(4*side));


                
                break;
                case 3:
                System.out.println("enter the length of rectangle");
                Double length=scan.nextDouble();
                System.out.println("enter the breath of rectangle");
                Double breath=scan.nextDouble();

                System.out.println("the premeter of the rectangle is "+(length*breath));
                System.out.println("the area of the rectangle is "+(length*breath)+2);


                
                break;
                case 4:
                System.out.println("enter the first value");
                Double value1=scan.nextDouble();
                System.out.println("enter the second value");
                Double value2=scan.nextDouble();
                System.out.println("enter the third  value");
                Double value3=scan.nextDouble();
                double f=((value1*value1)+(value2*value2));
                System.out.println(f);
                double g=(value3*value3);
                System.out.println(g);
                if(f==g){
                    System.out.println("it is pythagorean theorem");
                }
                else{
                    System.out.println("not a pythagoreon theorem");
                }                
                break;
        


            default:
                System.out.println("enter the correct option");
                break;
        }
    }
    
}
