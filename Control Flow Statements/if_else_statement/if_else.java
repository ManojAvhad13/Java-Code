public class if_else {
    public static void main(String[] args) {

        // positive negative
        int number = 10;
        if (number >= 0) {

            System.out.println(number + " is positive");
        } else {

            System.out.println(number + " is negative");
        }

        // largest number

        // int a = 10, b = 55;

        // if (a > b) {
        // System.out.println(a + " is largest");
        // } else {

        // System.out.println(b + " is largest");
        // }

        // largest a, b, c

        int a = 10, b = 55;
        int c = 102;

        // largest of a, b and c
        System.out.println("-------------------------");
        System.out.println("a = " + a + " b = " + b + " c = " + c);

        if (a > b) {
            if (a > c)
                System.out.println("a is largest");
            else
                System.out.println("c is largest");
        } else {
            if (b > c)
                System.out.println("b is largest");
            else
                System.out.println("c is largest");

        }

    }
}
