package com.geekbrains.javaCore2;

import com.geekbrains.javaCore2.athletes.Player;
import com.geekbrains.javaCore2.obstacles.Obstacle;

import java.util.List;

public class Course {

    private final List<Obstacle> obstacles;

    public Course(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public void dolt(Team team){
        Player[] player = team.getPlayers();
        for (int i = 0; i < 4; i++) {
            for (Obstacle obstacle : obstacles) {
                if (player[i].isPassed()) {
                    player[i].takeObstacle(obstacle);
                }
            }
        }
    }
}
