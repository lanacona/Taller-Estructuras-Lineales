package matrices;

import java.util.Random;
import java.util.Scanner;
import utils.Printer;
import utils.Processor;

public class Exercise14 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("Enter number of rows (m): ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Fill with random numbers between -50 and 50
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = randomGenerator.nextInt(101) - 50;
            }
        }

        System.out.println("\n--- Exercise 14: Matrix Transpose ---");
        Printer.printMatrix(matrix, "Original matrix:");

        int[][] transpose = Processor.transposeMatrix(matrix);
        Printer.printMatrix(transpose, "Transposed matrix:");

        scanner.close();
    }

}
