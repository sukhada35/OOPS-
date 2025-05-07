// WAP to create a class named as Bird which consist the three constructor: first constructor displays the name of the bird with 
// no-arguments. Second constructor takes the name of the bird as a parameter and third constructor takes both name and age of 
// the bird as a parameter. Create three instances of class and display the names of the bird. 
public class task9 
{
    public static void main(String[] args) 
    {
        Bird obj1 = new Bird();
        Bird obj2 = new Bird("Bird1");
        Bird obj3 = new Bird("bird2" , 15);
    }    
}
class Bird
{
    Bird()
    {
        System.out.println("Unnamed bird: ");
    }
    Bird(String name)
    {
        System.out.println("Name of the bird: " + name);
    }
    Bird(String name, int age)
    {
        System.out.println("Name of the bird: " + name);
        System.out.println("Age of the bird: " + age);
    }
}
