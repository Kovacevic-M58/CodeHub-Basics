import java.util.Scanner;

/*Two dimensional arrays*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columnss: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the 2D Array: ");
        for(int rowIndex = 0; rowIndex < rows; rowIndex++){
            for(int colIndex = 0; colIndex < cols; colIndex++){
                matrix[rowIndex][colIndex] = scanner.nextInt();
            }
        }

        TwoDimensionalArrays twoDimensionalArrays = new TwoDimensionalArrays();

        twoDimensionalArrays.printTwoDimensionalArray(matrix, rows, cols);

        System.out.print("Enter the row where you want to know the average value: ");
        int rowNumber = scanner.nextInt();
        if(rowNumber > rows || rowNumber < 0)
            throw new IllegalArgumentException("Entered a non-existent row.");

        System.out.println(twoDimensionalArrays.getAverageValueOfMatrixRow(matrix, cols, rowNumber));

        twoDimensionalArrays.printDiagonal(matrix, rows, cols);

        twoDimensionalArrays.printAboveDiagonal(matrix, rows, cols);

        scanner.close();

    }
}