package Utils;

public class TestClass {

int i=2;
static int j=3;

    public static void main(String[] args)
    {
       // fun1();
       TestClass.fun1();
    }

    public  static void fun1()
    {
       fun2();
    }

    public  static void fun2()
    {
        System.out.println("In fun2");
    }
}
