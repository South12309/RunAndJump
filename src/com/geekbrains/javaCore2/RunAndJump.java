package com.geekbrains.javaCore2;

import com.geekbrains.javaCore2.athletes.Cat;
import com.geekbrains.javaCore2.athletes.Human;
import com.geekbrains.javaCore2.athletes.Player;
import com.geekbrains.javaCore2.athletes.Robot;
import com.geekbrains.javaCore2.obstacles.Obstacle;
import com.geekbrains.javaCore2.obstacles.Treadmill;
import com.geekbrains.javaCore2.obstacles.Wall;

import java.util.ArrayList;
import java.util.List;

public class RunAndJump {
    public static void main(String[] args) {

        Player[] players = new Player[4] ;
        players[0] = new Human("Ivan", 10, 12);
        players[1] = new Cat("Barsik", 30, 5);
        players[2] = new Robot("Robo", 100, 50);
        players[3] = new Robot("Robo2", 100, 50);

        Team team = new Team("team1", players);

        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Treadmill(10));
        obstacles.add(new Treadmill(6));
        obstacles.add(new Treadmill(5));
        obstacles.add(new Treadmill(12));
        obstacles.add(new Wall(12));
        obstacles.add(new Wall(5));
        obstacles.add(new Wall(6));
        obstacles.add(new Wall(19));

        Course course = new Course(obstacles);

        course.dolt(team);

        team.showResults();
        team.showAll();






    }
}
