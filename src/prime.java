import java.util.Scanner;

public class prime {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number:");
            int number = scanner.nextInt();
            if (check(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
        public static boolean check(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
}


/*
OUTPUT:
1.
Enter a number:121
121 is not a prime number

2.
Enter a number:121
121 is not a prime number
*/
