package arraylist;

import java.util.ArrayList;
import java.util.Random;
import utils.Processor;
import utils.Printer;

public class Exercise8 {
    public void run() {
        Random randomGenerator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Generar 100 números aleatorios entre 1 y 20
        for (int i = 0; i < 100; i++) {
            numbers.add(randomGenerator.nextInt(20) + 1);
        }

        // Calcular frecuencias
        int[] frequencies = Processor.calculateFrequencies(numbers, 20);

        // Encontrar el número más frecuente
        int mostFrequentNumber = Processor.findMostFrequent(frequencies);

        System.out.println("\n--- Exercise 8: Frequency Table ---");
        Printer.printArrayList(numbers, "Generated numbers:");
        Printer.printFrequencyTable(frequencies);
        System.out.println("Most frequent number: " + mostFrequentNumber);
    }


}
