package arraylist;

import java.util.ArrayList;
import java.util.Random;
import utils.Printer;
import utils.Processor;

public class Exercise6 {
    public void run() {
        Random randomGenerator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        int number;
        do {
            number = randomGenerator.nextInt(21) - 10; // rango -10 a 10
            numbers.add(number);
        } while (number != 10);

        int sum = Processor.calculateSum(numbers);
        double average = Processor.calculateAverage(numbers);

        System.out.println("\n--- Exercise 6: ArrayList until 10 ---");
        Printer.printArrayList(numbers, "Numbers read:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }


}
