package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Printer;

public class Exercise7 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Inicializar con los 20 primeros pares
        for (int i = 1; i <= 20; i++) {
            evenNumbers.add(i * 2);
        }

        System.out.println("\n--- Exercise 7: ArrayList operations ---");
        Printer.printArrayList(evenNumbers, "Initial ArrayList:");

        // Insertar un número en la posición correcta
        System.out.print("Enter a number to insert: ");
        int numberToInsert = scanner.nextInt();
        insertInOrder(evenNumbers, numberToInsert);
        Printer.printArrayList(evenNumbers, "ArrayList after insertion:");

        // Borrar un número solicitado
        System.out.print("Enter a number to remove: ");
        int numberToRemove = scanner.nextInt();
        evenNumbers.remove(Integer.valueOf(numberToRemove));
        Printer.printArrayList(evenNumbers, "ArrayList after removal:");
    }

    // Método para insertar manteniendo orden ascendente
    private void insertInOrder(ArrayList<Integer> list, int number) {
        int index = 0;
        while (index < list.size() && list.get(index) < number) {
            index++;
        }
        list.add(index, number);
    }


}
