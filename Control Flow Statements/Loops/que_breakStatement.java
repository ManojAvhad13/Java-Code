// Keep entering number till user entera multiple of 10 

import java.util.Scanner;

public class que_breakStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while (true);
    }
}
