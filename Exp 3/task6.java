// A computer science professor written the java code as created a class called “MyClass” with a method named “myMethod” that is 
// overloaded with four different visibility modifiers: public, private, protected and default (package-private). 
// Demonstrate the above concept with method overloading under various visibility modifiers. 
public class task6
{
    public static void main(String[] args) 
    {
        Myclass obj = new Myclass();
        obj.myMethod();
        obj.myMethod('-');
        obj.myMethod("default function");
        obj.callPrivateMethod(10);
    }
}
class Myclass
{
    public void myMethod()
    {
        System.out.println("Public function with no arguments");
    }
    private void myMethod(int a)
    {
        System.out.println("Private function with integer argument: " + a);
    }
    protected void myMethod(char a)
    {
        System.out.println("Protected function with character argument: " + a);
    }
    void myMethod(String a)
    {
        System.out.println("Default function with String argument: " + a);
    }
    public void callPrivateMethod(int a)
    {
        myMethod(a);
    }
}
