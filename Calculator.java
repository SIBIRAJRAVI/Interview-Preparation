public class Calculator
{
    int a=10;
    int b=30;

    public static void main(String[] args)
    {
    Calculator calc = new Calculator();
    calc.add();
    calc.sub();
    calc.mul();
    calc.divide();

    }
public void add()
{
System.out.println(a+b);
}
public void sub(){
    System.out.println(a-b);
}
public void mul(){
    System.out.println(a*b);
}
public void divide(){
    System.out.println(a/b);
}

}

