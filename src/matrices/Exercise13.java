package matrices;

import java.util.Random;
import java.util.Scanner;
import utils.Printer;
import utils.Processor;

public class Exercise13 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("Enter matrix size (n): ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        // Fill with random numbers between -50 and 50
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = randomGenerator.nextInt(101) - 50;
            }
        }

        System.out.println("\n--- Exercise 13: Symmetry and Corners ---");
        Printer.printMatrix(matrix, "Generated matrix:");

        boolean isSymmetric = Processor.isSymmetric(matrix);
        if (isSymmetric) {
            System.out.println("The matrix IS symmetric.");
        } else {
            System.out.println("The matrix IS NOT symmetric.");
        }

        Printer.printMatrixCorners(matrix, "Matrix corners:");

        scanner.close();
    }

}
