package arreglos;

import java.util.Random;
import utils.Printer;
import utils.Processor;

public class Exercise4 {
    public void run() {
        Random randomGenerator = new Random();
        int[] numbers = new int[25];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(101) - 50; // range -50 a 50
        }

        int min = Processor.findMin(numbers);
        int max = Processor.findMax(numbers);

        System.out.println("\n--- Exercise 4: Min and Max ---");
        Printer.printArray(numbers, "Generated numbers:");
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

}
