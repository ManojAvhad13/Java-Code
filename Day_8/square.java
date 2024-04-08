import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double area = calculateArea(sideLength);
        double perimeter = calculatePerimeter(sideLength);

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }

    public static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }
}
