/*Min-Max task*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long[] numbers = new long[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextLong();
        }

        Methods methods = new Methods();

        System.out.println("Minimum sum of 4 numbers is " + methods.getMinSum(numbers) +
                " and the maximum value is " + methods.getMaxSum(numbers) + ".");

        scanner.close();
    }
}