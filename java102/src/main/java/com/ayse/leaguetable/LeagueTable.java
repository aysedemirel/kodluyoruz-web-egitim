package com.ayse.leaguetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A class should be written to create a random match fixture for the entered teams in Java.
 * A double round-robin league system will be applied. Each team will play two matches with other teams, one at home and one away.
 * The left side of the list shows the home team and the right side shows the away team.
 * If an odd number of teams is entered, a team named "Bay" should be added to make it an even number.
 * Teams matched with "Bay" will not play that week.
 *
 * @author aysedemireldeniz
 */
public class LeagueTable {
    private final Scanner scanner;
    private final List<String> teams;
    private final List<String> table;

    public LeagueTable() {
        scanner = new Scanner(System.in);
        teams = new ArrayList<>();
        table = new ArrayList<>();
        // selectTeam();
        setDefaultTeam();
        printTeam();
        createLeague();
        printLeague();
    }

    public static void main(String[] args) {
        new LeagueTable();
    }

    private void selectTeam() {
        int teamCount = scanner.nextInt();
        System.out.println("Enter teams: ");
        for (int i = 0; i < teamCount; i++) {
            teams.add(scanner.next());
        }
        if (teamCount % 2 != 0) {
            teams.add("Bay");
        }
    }

    private void setDefaultTeam() {
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Ispartaspor");
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
    }

    private void createLeague() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = 0; j < teams.size(); j++) {
                if (!teams.get(i).equals(teams.get(j))) {
                    table.add(teams.get(i) + "-" + teams.get(j));
                }
            }
        }
        Collections.shuffle(table);
    }

    private void printLeague() {
        int oneLeague = teams.size() / 2;
        int week = 1;
        for (int i = 0; i < table.size(); i++) {
            if (i % oneLeague == 0) {
                System.out.println("Week " + week + ":");
                week++;
            }
            System.out.println(table.get(i));
        }
    }

    private void printTeam() {
        teams.forEach(i -> System.out.println(i));
    }
}
