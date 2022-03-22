package com.geekbrains.javaCore2.athletes;

import com.geekbrains.javaCore2.Jumpable;
import com.geekbrains.javaCore2.Runable;
import com.geekbrains.javaCore2.obstacles.Obstacle;
import com.geekbrains.javaCore2.obstacles.Treadmill;
import com.geekbrains.javaCore2.obstacles.Wall;

public class Human extends Player implements Jumpable, Runable {

    private final String name;

    private final int jumpHeight;
    private final int runDistance;

    public Human(String name, int jumpHeight, int runDistance) {
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
    public void run(Treadmill treadmill) {
        if (runDistance > treadmill.getDistance()) {
            System.out.println("Человек " + name + " успешно пробежал " + treadmill.getDistance() + " метров");
        } else {
            System.out.println("Человеку " + name + " не удалось пробежать " + treadmill.getDistance() + " метров");
            passed = false;

        }

    }

    @Override
    public void jump(Wall wall) {
        if (jumpHeight>wall.getHeight()) {
            System.out.println("Человек " + name + " перепрыгнул стену высотой " + wall.getHeight() + " метров");
        } else {
            System.out.println("Человеку " + name + " не удалось перепрыгнуть стену высотой " + wall.getHeight() + " метров");
            passed = false;
        }
            }

    @Override
    public String toString() {
        return "Человек " + name;
    }

}
