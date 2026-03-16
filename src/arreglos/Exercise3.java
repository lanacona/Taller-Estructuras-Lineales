package arreglos;

import utils.Processor;
import java.util.Random;
import java.util.Scanner;
import utils.Printer;

public class Exercise3 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("\n--- Exercise 3: Factorials ---");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] factorials = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = randomGenerator.nextInt(10); 
            factorials[i] = Processor.calculateFactorial(numbers[i]);
        }

        Printer.printArray(numbers, "Original numbers:");
        Printer.printArray(factorials, "Factorials:");
        scanner.close();
    }

}
