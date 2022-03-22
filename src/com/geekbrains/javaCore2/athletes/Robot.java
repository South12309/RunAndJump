package com.geekbrains.javaCore2.athletes;

import com.geekbrains.javaCore2.Jumpable;
import com.geekbrains.javaCore2.Runable;
import com.geekbrains.javaCore2.obstacles.Obstacle;
import com.geekbrains.javaCore2.obstacles.Treadmill;
import com.geekbrains.javaCore2.obstacles.Wall;

public class Robot extends Player implements Runable, Jumpable {
    private final String name;

    private final int jumpHeight;
    private final int runDistance;

    public Robot(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void takeObstacle(Obstacle obstacle) {
        if (obstacle instanceof Treadmill) {
            run((Treadmill) obstacle);
        } else if (obstacle instanceof Wall) {
            jump((Wall) obstacle);
        }
    }

    @Override
    public void jump(Wall wall) {
        if (jumpHeight>wall.getHeight()) {
            System.out.println("Робот " + name + " перепрыгнул стену высотой " + wall.getHeight() + " метров");
        } else {
            System.out.println("Роботу " + name + " не удалось перепрыгнуть стену высотой " + wall.getHeight() + " метров");
            passed = false;
        }


    }

    @Override
    public void run(Treadmill treadmill) {
        if (runDistance > treadmill.getDistance()) {
            System.out.println("Робот " + name + " успешно пробежал " + treadmill.getDistance() + " метров");
        } else {
            System.out.println("Роботу " + name + " не удалось пробежать " + treadmill.getDistance() + " метров");
            passed = false;
        }

    }
    @Override
    public String toString() {
        return "Робот " + name;
    }


}
