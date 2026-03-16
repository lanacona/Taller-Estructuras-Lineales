package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import utils.Printer;

public class Exercise9 {
    public void run() {
        Random randomGenerator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Generate 20 random numbers between 1 and 100
        for (int i = 0; i < 20; i++) {
            numbers.add(randomGenerator.nextInt(100) + 1);
        }

        System.out.println("\n--- Exercise 9: ArrayList sorting and separation ---");
        Printer.printArrayList(numbers, "Original numbers:");

        // Order from smallest to largest
        ArrayList<Integer> ascending = new ArrayList<>(numbers);
        Collections.sort(ascending);
        Printer.printArrayList(ascending, "Sorted ascending:");

        // Sort from highest to lowest
        ArrayList<Integer> descending = new ArrayList<>(numbers);
        descending.sort(Collections.reverseOrder());
        Printer.printArrayList(descending, "Sorted descending:");

        // Separate even and odd numbers
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int value : numbers) {
            if (value % 2 == 0) {
                evens.add(value);
            } else {
                odds.add(value);
            }
        }
        Printer.printArrayList(evens, "Even numbers:");
        Printer.printArrayList(odds, "Odd numbers:");
    }

}
