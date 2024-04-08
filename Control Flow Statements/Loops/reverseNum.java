public class reverseNum {
    public static void main(String[] args) {
        int num = 10899;

        while (num > 0) {
            int lastDigit = num % 10; // get last number
            System.out.print(lastDigit);
            num = num / 10; // remove last number or small last number
        }
        System.out.println();
    }
}

// user input

// import java.util.Scanner;

// public class reverse_givenNum {
// public static void main(String[] args) {
// // int num;
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter Number You Want to Reverse: ");
// int num = scanner.nextInt();

// while (num > 0) {
// int lastDigit = num % 10;
// System.out.print(lastDigit);
// num = num / 10;
// }
// }
// }
