import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter operator: ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Ans: " + (a + b));
                break;

            case '-':
                System.out.println("Ans: " + (a - b));
                break;
            case '*':
                System.out.println("Ans: " + (a * b));
                break;
            case '/':
                System.out.println("Ans: " + (a / b));
                break;
            case '%':
                System.out.println("Ans: " + (a % b));
                break;

            default:
                System.out.println("Wrong operator");
                break;
        }
    }
}
