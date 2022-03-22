package com.geekbrains.javaCore2.obstacles;

public class Treadmill extends Obstacle {
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
