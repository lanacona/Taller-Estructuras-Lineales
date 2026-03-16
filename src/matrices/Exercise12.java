package matrices;

import java.util.Random;
import java.util.Scanner;
import utils.Printer;
import utils.Processor;

public class Exercise12 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("\n--- Exercise 12: Opposite Diagonal Sum ---");
        System.out.print("Enter matrix size (n): ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        // Rellenar con números aleatorios entre -50 y 50
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = randomGenerator.nextInt(101) - 50;
            }
        }

        Printer.printMatrix(matrix, "Generated matrix:");

        int sumOppositeDiagonal = Processor.sumOppositeDiagonal(matrix);
        System.out.println("Sum of opposite diagonal: " + sumOppositeDiagonal);
    }

}
