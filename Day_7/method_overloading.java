package Day_7;

public class method_overloading {
    // sum of two number
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of three number
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two number is: " + sum(10, 5)); // finction call and print
        System.out.println("Sum of three number is: " + sum(5, 20, 30));
    }
}
