package Tasks.Fikstur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MatchFixtureGenerator {

    private List<String> teams;

    public MatchFixtureGenerator(List<String> teams) {
        this.teams = teams;
    }

    public List<Pair<String, String>> generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add("dummy");
        }

        Collections.shuffle(teams);

        List<Pair<String, String>> fixtures = new ArrayList<>();
        int totalRounds = teams.size() - 1;
        int halfSize = teams.size() / 2;

        for (int round = 0; round < totalRounds; round++) {
            for (int match = 0; match < halfSize; match++) {
                String homeTeam = teams.get(match);
                String awayTeam = teams.get(teams.size() - 1 - match);

                if (!homeTeam.equals("dummy") && !awayTeam.equals("dummy")) {
                    fixtures.add(new Pair<>(homeTeam, awayTeam));
                }
            }

            teams.add(1, teams.remove(teams.size() - 1));
        }

        return fixtures;
    }

    private static class Pair<T, U> {
        T first;
        U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return first + " vs. " + second;
        }
    }

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Team A");
        teams.add("Team B");
        teams.add("Team C");
        teams.add("Team D");

        MatchFixtureGenerator fixtureGenerator = new MatchFixtureGenerator(teams);
        List<Pair<String, String>> fixtures = fixtureGenerator.generateFixtures();

        System.out.println("Match Fixtures:");
        for (Pair<String, String> fixture : fixtures) {
            System.out.println(fixture);
        }
    }
}
