package matrices;

import java.util.Random;
import java.util.Scanner;
import utils.Printer;
import utils.Processor;

public class Exercise11 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("\n--- Exercise 11: Matrix Search ---");
        System.out.print("Enter number of rows (m): ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Fill with random numbers between 0 and 99
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = randomGenerator.nextInt(100);
            }
        }

        Printer.printMatrix(matrix, "Generated matrix:");

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        int[] position = Processor.findInMatrix(matrix, target);

        if (position != null) {
            System.out.println("Number " + target + " found at position: (" 
                               + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Number " + target + " not found in the matrix.");
        }
        scanner.close();
    }

}
