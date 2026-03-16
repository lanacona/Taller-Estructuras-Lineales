package arreglos;

import java.util.Random;
import utils.Processor;
import utils.Printer;

public class Exercise5 {
    public void run() {
        Random randomGenerator = new Random();
        int[] numbers = new int[20];
        int[] invertedNumbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(100); // numbers between 0 y 99
            invertedNumbers[i] = Processor.invertNumber(numbers[i]);
        }

        System.out.println("\n--- Exercise 5: Invert Numbers ---");
        Printer.printArray(numbers, "Original numbers:");
        Printer.printArray(invertedNumbers, "Inverted numbers:");
    }

}
