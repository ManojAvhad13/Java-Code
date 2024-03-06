public class MyClass {

    static int no; // Declare static variable here

    int number; // Declare instance variable here

    static {
        no = 100;
    }

    public MyClass() {
        no++;
        number++;
    }

    public static void display() {
        System.out.println("Static no within static method = " + no);
        // System.out.println("Non static number = "+number);
    }

    void show() {
        System.out.println("Static no = " + no);
        System.out.println("Non static number = " + number);
    }

    public static void main(String[] args) {
        // Your main method code here
    }
}
