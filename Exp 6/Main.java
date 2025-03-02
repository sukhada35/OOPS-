// class Animal {
//     public final void display() {
//         System.out.println("This is Animal class.");
//     }
// }

// class Dog extends Animal {
//     // Attempting to override final method (error)
//     public void display() {
//         System.out.println("This is Dog class.");
//     }

// }
// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.display(); // Calls the method from Animal (because overriding is NOT allowed)
//     }
// }

final class Animal {
    public void display() {
        System.out.println("This is Animal class.");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("This is Dog class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.display();
    }
}
