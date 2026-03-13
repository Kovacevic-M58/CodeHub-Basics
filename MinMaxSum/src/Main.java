/*Min-Max task*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long[] numbers = new long[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int index = 0; index < 5; index++) {
            numbers[index] = scanner.nextLong();
        }

        MinMax minMax = new MinMax();

        System.out.println("Minimum sum of 4 numbers is " + minMax.getMinSum(numbers) +
                " and the maximum value is " + minMax.getMaxSum(numbers) + ".");

        scanner.close();
    }
}