package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Printer;

public class Exercise7 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Initialize with the first 20 pairs
        for (int i = 1; i <= 20; i++) {
            evenNumbers.add(i * 2);
        }

        System.out.println("\n--- Exercise 7: ArrayList operations ---");
        Printer.printArrayList(evenNumbers, "Initial ArrayList:");

        // Insert a number in the correct position
        System.out.print("Enter a number to insert: ");
        int numberToInsert = scanner.nextInt();
        insertInOrder(evenNumbers, numberToInsert);
        Printer.printArrayList(evenNumbers, "ArrayList after insertion:");

        // Delete a requested number
        System.out.print("Enter a number to remove: ");
        int numberToRemove = scanner.nextInt();
        evenNumbers.remove(Integer.valueOf(numberToRemove));
        Printer.printArrayList(evenNumbers, "ArrayList after removal:");
        scanner.close();
    }

    // Method to insert while maintaining ascending order
    private void insertInOrder(ArrayList<Integer> list, int number) {
        int index = 0;
        while (index < list.size() && list.get(index) < number) {
            index++;
        }
        list.add(index, number);
    }

}
