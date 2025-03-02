// Parent interface
interface Line 
{        
    void drawLine();  
}

interface Rectangle extends Line 
{     
    void drawRectangle(); 
}

interface Triangle extends Line 
{     
    void drawTriangle(); 
}

class Shape1 implements Rectangle, Triangle 
{
    public void drawLine() 
    {         
        System.out.println("Line drawn for Shape1");
    }

    public void drawRectangle() 
    {  
        System.out.println("Rectangle drawn for Shape1");
    }

    public void drawTriangle() 
    {  
        System.out.println("Triangle drawn for Shape1");
    }
}

class Shape2 implements Rectangle, Triangle 
{
    public void drawLine() 
    {         
        System.out.println("Line drawn for Shape2");
    }

    public void drawRectangle() 
    {        
        System.out.println("Rectangle drawn for Shape2");
    }

    public void drawTriangle() 
    {  
        System.out.println("Triangle drawn for Shape2");
    }
}

public class Main4 
{
    public static void main(String[] args) 
    {
        Shape1 shape1 = new Shape1();
        System.out.println("Shape1 Drawing:");
        shape1.drawLine();
        shape1.drawRectangle();
        shape1.drawTriangle();

        Shape2 shape2 = new Shape2();
        System.out.println("\nShape2 Drawing:");
        shape2.drawLine();
        shape2.drawRectangle();
        shape2.drawTriangle();
    }
}
