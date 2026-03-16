package utils;

import java.util.ArrayList;

public class Processor {

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int invertNumber(int number) {
        int inverted = 0;
        while (number != 0) {
            int digit = number % 10;
            inverted = inverted * 10 + digit;
            number /= 10;
        }
        return inverted;
    }

    // Methods for ArrayList
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return sum;
    }

    public static double calculateAverage(ArrayList<Integer> list) {
        if (list.isEmpty())
            return 0;
        return (double) calculateSum(list) / list.size();
    }

    public static int[] calculateFrequencies(ArrayList<Integer> list, int maxNumber) {
        int[] frequencies = new int[maxNumber + 1]; // index 0 is not used
        for (int value : list) {
            frequencies[value]++;
        }
        return frequencies;
    }

    public static int findMostFrequent(int[] frequencies) {
        int maxFrequency = frequencies[1];
        int mostFrequentNumber = 1;
        for (int i = 2; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                mostFrequentNumber = i;
            }
        }
        return mostFrequentNumber;
    }

    public static int[] findInMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i, j }; // first occurrence
                }
            }
        }
        return null; // not found
    }

    public static int sumOppositeDiagonal(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i]; // secondary diagonal
        }
        return sum;
    }

    public static boolean isSymmetric(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void swapFirstTwoRows(int[][] matrix) {
        if (matrix.length < 2) {
            System.out.println("Matrix must have at least 2 rows to swap.");
            return;
        }

        int cols = matrix[0].length;
        for (int j = 0; j < cols; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[1][j];
            matrix[1][j] = temp;
        }
    }

}
