// public class loops {
//     public static void main(String[] args) {
//         int count = 0;
//         while (count < 10) {
//             System.out.println("Hello World");
//             count++;
//         }
//     }
// }

// Print 1 to 100;

// public class loops {
//     public static void main(String[] args) {
//         int count = 1;
//         while (count <= 10) {
//             System.out.println(count);
//             count++;
//         }
//     }
// }

// user input

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}
