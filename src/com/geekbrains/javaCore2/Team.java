package com.geekbrains.javaCore2;

import com.geekbrains.javaCore2.athletes.Player;
import com.geekbrains.javaCore2.obstacles.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String nameTeam;
    private final Player[] players;

    public Team(String nameTeam, Player[] players) {
        this.nameTeam = nameTeam;
        this.players = players;
    }

    public void showAll() {
        System.out.println("");
        System.out.println("Список всех участников");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void showResults() {
        System.out.println("");
        System.out.println("Участники которые прошли всю полосу");
        for (Player player : players) {
            if (player.isPassed()) {
                System.out.println(player);
            }
        }
    }

    public Player[] getPlayers() {
        return players;
    }
}
