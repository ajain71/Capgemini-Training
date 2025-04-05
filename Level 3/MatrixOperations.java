
import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers from 0 to 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Matrix Addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Matrix Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Matrix Multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return new int[0][0]; // Return empty matrix
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Transpose of a Matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix has no inverse!");
            return new double[0][0]; // No inverse possible
        }
        double invDet = 1.0 / det;
        double[][] inverse = {
            { matrix[1][1] * invDet, -matrix[0][1] * invDet },
            { -matrix[1][0] * invDet, matrix[0][0] * invDet }
        };
        return inverse;
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;

        // Generate random matrices
        int[][] matrixA = generateMatrix(rows, cols);
        int[][] matrixB = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("Matrix A + Matrix B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("Matrix A - Matrix B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("Matrix A * Matrix B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        // Transpose
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        // Determinant (for 2x2 and 3x3)
        int[][] smallMatrix = { {4, 3}, {6, 3} };
        System.out.println("Determinant of 2x2 matrix: " + determinant2x2(smallMatrix));
        System.out.println("Determinant of 3x3 matrix: " + determinant3x3(matrixA));

        // Inverse of 2x2 matrix
        double[][] inverse = inverse2x2(smallMatrix);
        System.out.println("Inverse of 2x2 matrix:");
        for (double[] row : inverse) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}

