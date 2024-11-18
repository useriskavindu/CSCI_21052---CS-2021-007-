import java.util.*;

public class Q2 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        number = Math.abs(number); // Handle negative numbers

        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter any non-negative number (-1 to quit): ");
            int input = scanner.nextInt();

            if (input == -1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (input < 0) {
                System.out.println("Error :: Number is negative. Please try again.");
                System.out.println("***********************************************************");
                continue;
            }

            System.out.println("Number of digits of " + input + " are :: " + countDigits(input));
            System.out.println("--------------------------------------------------------------");
        }

        scanner.close(); // Ensure resources are released
    }
}
