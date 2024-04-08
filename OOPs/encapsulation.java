public class encapsulation {
    public static void main(String[] args) {
        encapsulation encapsulation = new encapsulation(); // Create an instance of the Encapsulation class
        Person person = encapsulation.new Person(); // Create an instance of the inner Person class

        person.setName("Manoj");
        person.setAge(22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set age to a negative value
        person.setAge(-5);
    }

    public class Person {
        private String name;
        private int age;

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            if (age >= 0) { // Ensuring age is non-negative
                this.age = age;
            } else {
                System.out.println("Age cannot be negative");
            }
        }
    }
}