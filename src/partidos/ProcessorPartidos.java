package partidos;

import java.util.ArrayList;
import java.util.Iterator;

public class ProcessorPartidos {
    // Show matches where the away team won
    public static void printAwayWins(ArrayList<PartidoFutbol> matches) {
        System.out.println("\n--- Matches where the away team won ---");
        for (PartidoFutbol match : matches) {
            if (match.getAwayGoals() > match.getHomeGoals()) {
                System.out.println(match);
            }
        }
    }

    // Count Barcelona wins
    public static int countBarcelonaWins(ArrayList<PartidoFutbol> matches) {
        int wins = 0;
        for (PartidoFutbol match : matches) {
            if (match.getHomeTeam().equalsIgnoreCase("Barcelona") && match.getHomeGoals() > match.getAwayGoals()) {
                wins++;
            }
            if (match.getAwayTeam().equalsIgnoreCase("Barcelona") && match.getAwayGoals() > match.getHomeGoals()) {
                wins++;
            }
        }
        return wins;
    }

    // Remove non-draw matches
    public static void keepOnlyDraws(ArrayList<PartidoFutbol> matches) {
        Iterator<PartidoFutbol> iterator = matches.iterator();
        while (iterator.hasNext()) {
            PartidoFutbol match = iterator.next();
            if (match.getHomeGoals() != match.getAwayGoals()) {
                iterator.remove();
            }
        }
    }

    // Count home team wins
    public static int countHomeWins(ArrayList<PartidoFutbol> matches) {
        int wins = 0;
        for (PartidoFutbol match : matches) {
            if (match.getHomeGoals() > match.getAwayGoals()) {
                wins++;
            }
        }
        return wins;
    }

}
