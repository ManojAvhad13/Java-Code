import java.util.Scanner;

public class number_1_to_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int counter = 1;

        while (counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
