public class single_level_inheritance {
    public static void main(String[] args) {
        // Creating an object of the child class
        Dog myDog = new Dog("Buddy");

        // Accessing methods from both parent and child class
        myDog.eat(); // Output: Buddy is eating.
        myDog.sleep(); // Output: Buddy is sleeping.
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
