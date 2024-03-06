// Parent class
class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class inheriting from Animal
class Stud extends Student {
    public Stud(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " to studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Stud myStud = new Stud("Manoj");
        myStud.eat(); // Calling method from parent class
        myStud.study(); // Calling method from child class
    }
}
