
public class TwoDimensionalArrays {

    public void checkMatrixSize(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }
    }

    public void printTwoDimensionalArray(int[][] matrix, int rows, int cols){

        checkMatrixSize(matrix);

        for(int rowIndex = 0; rowIndex < rows; rowIndex++){
            for(int colIndex = 0; colIndex < cols; colIndex++){
                System.out.print(matrix[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    public float getAverageValueOfMatrixRow(int[][] matrix, int cols, int rowNumber){

        checkMatrixSize(matrix);

        float avg = 0;

        for(int colIndex = 0; colIndex < cols; colIndex++){
            avg += (float)matrix[rowNumber - 1][colIndex];
        }

        avg = avg / cols;

        return avg;
    }

    public void printDiagonal(int[][] matrix, int rows, int cols){

        checkMatrixSize(matrix);

        for(int colIndex = 0; colIndex < cols; colIndex++){
            for(int rowIndex = 0; rowIndex < rows; rowIndex++){
                if(rowIndex + colIndex == rows - 1)
                    System.out.print(matrix[rowIndex][colIndex] + " ");
            }
        }
        System.out.println();
        System.out.println("---------------");
    }

    public void printAboveDiagonal(int[][] matrix, int rows, int cols){

        checkMatrixSize(matrix);

        for(int rowIndex = 0; rowIndex < rows; rowIndex++){
            for(int colIndex = 0; colIndex < cols; colIndex++){
                if(rowIndex + colIndex < rows - 1)
                    System.out.print(matrix[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
