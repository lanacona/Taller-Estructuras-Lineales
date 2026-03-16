package utils;

import java.util.ArrayList;

public class Processor {

    // Calculate factorial of a number
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

    // Métodos para ArrayList
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return sum;
    }

    public static double calculateAverage(ArrayList<Integer> list) {
        if (list.isEmpty()) return 0;
        return (double) calculateSum(list) / list.size();
    }

    public static int[] calculateFrequencies(ArrayList<Integer> list, int maxNumber) {
        int[] frequencies = new int[maxNumber + 1]; // índice 0 no se usa
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
                    return new int[]{i, j}; // primera ocurrencia
                }
            }
        }
        return null; // no encontrado
    }

    public static int sumOppositeDiagonal(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i]; // diagonal secundaria
        }
        return sum;
    }


}
