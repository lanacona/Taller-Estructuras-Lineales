package arreglos;

import utils.Printer;

public class Exercise2 {

    public void run() {
        int[] evenNumbers = new int[100];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }

        System.out.println("Exercise 2 : First 100 Even numbers");
        Printer.printArray(evenNumbers); // una sola línea
        Printer.printArrayInLines(evenNumbers, 10); // 10 líneas
    }

    
} 