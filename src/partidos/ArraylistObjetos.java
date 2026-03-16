package partidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistObjetos {
    private static final String FILE_NAME = "Taller-Estructuras-Lineales\\PartidoLiga.txt";

    public static void main(String[] args) {
        ArrayList<PartidoFutbol> matches = new ArrayList<>();

        // Read file and load matches
        try (Scanner reader = new Scanner(new File(FILE_NAME))) {
            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split("::");
                String home = data[0];
                String away = data[1];
                int homeGoals = Integer.parseInt(data[2]);
                int awayGoals = Integer.parseInt(data[3]);

                matches.add(new PartidoFutbol(home, away, homeGoals, awayGoals));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        System.out.println("Total matches loaded: " + matches.size());

        // Away wins
        ProcessorPartidos.printAwayWins(matches);

        // Barcelona wins
        int barcelonaWins = ProcessorPartidos.countBarcelonaWins(matches);
        System.out.println("\nBarcelona won " + barcelonaWins + " times.");

        // Keep only draws
        ProcessorPartidos.keepOnlyDraws(matches);
        System.out.println("\n--- Matches that ended in a draw ---");
        for (PartidoFutbol match : matches) {
            System.out.println(match);
        }

        // Home wins (note: after filtering, only draws remain, so count before
        // filtering if needed)
        int homeWins = ProcessorPartidos.countHomeWins(matches);
        System.out.println("\nHome teams won " + homeWins + " matches.");
    }

}
