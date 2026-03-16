package utils;

import java.util.ArrayList;

public class Printer {
    

    // Versión simple (Ejercicio 2)
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Versión con mensaje (Ejercicio 3 y otros)
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

    //Metodos arraylist
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

    //metods matriz
    
    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }


}
