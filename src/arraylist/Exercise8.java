package arraylist;

import java.util.ArrayList;
import java.util.Random;
import utils.Processor;
import utils.Printer;

public class Exercise8 {
    
    public void run() {
        Random randomGenerator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(randomGenerator.nextInt(20) + 1);
        }

        int[] frequencies = Processor.calculateFrequencies(numbers, 20);

        // Find the most frequent number
        int mostFrequentNumber = Processor.findMostFrequent(frequencies);

        System.out.println("\n--- Exercise 8: Frequency Table ---");
        Printer.printArrayList(numbers, "Generated numbers:");
        Printer.printFrequencyTable(frequencies);
        System.out.println("Most frequent number: " + mostFrequentNumber);
    }

}
