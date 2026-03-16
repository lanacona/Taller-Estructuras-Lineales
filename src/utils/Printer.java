package utils;

import java.util.ArrayList;

public class Printer {

    // Simple version
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Version with message
    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArrayInLines(int[] array, int elementsPerLine) {
        int lineNumber = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % elementsPerLine == 0) {
                System.out.print("\nLine " + lineNumber++ + ": ");
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Methods arraylist
    public static void printArrayList(ArrayList<Integer> list, String message) {
        System.out.println(message);
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printFrequencyTable(int[] frequencies) {
        System.out.println("\nNumber | Frequency");
        System.out.println("------------------");
        for (int i = 1; i < frequencies.length; i++) {
            System.out.println(i + "       | " + frequencies[i]);
        }
    }

    // methods matriz

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void printMatrixCorners(int[][] matrix, String message) {
        System.out.println(message);
        int size = matrix.length;
        System.out.println("Top-left corner: " + matrix[0][0]);
        System.out.println("Top-right corner: " + matrix[0][size - 1]);
        System.out.println("Bottom-left corner: " + matrix[size - 1][0]);
        System.out.println("Bottom-right corner: " + matrix[size - 1][size - 1]);
    }

}
