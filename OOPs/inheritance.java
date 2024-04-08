public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

// derived class or subclass

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim in water");
    }
}